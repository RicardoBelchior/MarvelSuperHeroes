package com.rbelchior.marvel.data

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import androidx.room.withTransaction
import com.rbelchior.marvel.data.local.Mapper.toEntity
import com.rbelchior.marvel.data.local.SuperHeroesDatabase
import com.rbelchior.marvel.data.local.entity.CharacterEntity
import com.rbelchior.marvel.data.local.entity.RemoteKeyEntity
import com.rbelchior.marvel.data.remote.Mapper.toModel
import com.rbelchior.marvel.data.remote.MarvelService

@ExperimentalPagingApi
class PagingRemoteMediator(
    private val searchQuery: String,
    private val database: SuperHeroesDatabase,
    private val marvelService: MarvelService
) : RemoteMediator<Int, CharacterEntity>() {

    private val characterDao = database.characterDao()
    private val remoteKeyDao = database.remoteKeyDao()

    override suspend fun initialize(): InitializeAction {
        // Here we could decide when to refresh on startup,
        // based on how old the data is. For now, keeping the default behaviour.
        return super.initialize()
    }

    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, CharacterEntity>
    ): MediatorResult {
        return try {
            val loadKey = when (loadType) {
                LoadType.REFRESH -> null
                LoadType.PREPEND -> return MediatorResult.Success(endOfPaginationReached = true)
                LoadType.APPEND -> {
                    val remoteKey = database.withTransaction {
                        remoteKeyDao.remoteKeyByQuery(encodeQuery(searchQuery))
                    }
                    if (remoteKey.nextKey == null) {
                        return MediatorResult.Success(
                            endOfPaginationReached = true
                        )
                    }
                    remoteKey.nextKey
                }
            }

            val limit = when (loadType) {
                LoadType.REFRESH -> state.config.initialLoadSize
                else -> state.config.pageSize
            }
            val nameStartsWith = if (searchQuery.isNotEmpty()) searchQuery else null
            val offset = loadKey ?: 0
            val response = marvelService.getCharacters(limit, offset, nameStartsWith)
            val characters = response.toModel()
            val nextKey = offset + response.data!!.count!!

            database.withTransaction {
                if (loadType == LoadType.REFRESH) {
                    remoteKeyDao.deleteByQuery(encodeQuery(searchQuery))
                    characterDao.deleteAll()
                }
                // Update RemoteKey for this query.
                remoteKeyDao.insertOrReplace(
                    RemoteKeyEntity(encodeQuery(searchQuery), nextKey)
                )

                // Insert new items into database, which invalidates the
                // current PagingData, allowing Paging to present the updates
                // in the DB.
                characterDao.insertAll(characters.map { it.toEntity() })
            }

            val total = response.data.total ?: 0
            MediatorResult.Success(
                endOfPaginationReached = nextKey > total
            )
        } catch (e: Exception) {
            MediatorResult.Error(e)
        }
    }

    private fun encodeQuery(searchQuery: String): String {
        return if (searchQuery.isEmpty()) {
            QUERY_LABEL_DEFAULT
        } else {
            searchQuery
        }
    }

    companion object {
        private const val QUERY_LABEL_DEFAULT = "<<<all>>>"
    }
}
