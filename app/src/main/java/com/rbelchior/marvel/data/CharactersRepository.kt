package com.rbelchior.marvel.data

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.map
import com.rbelchior.marvel.data.local.Mapper.toEntity
import com.rbelchior.marvel.data.local.Mapper.toModel
import com.rbelchior.marvel.data.local.SuperHeroesDatabase
import com.rbelchior.marvel.data.remote.Mapper.toModel
import com.rbelchior.marvel.data.remote.MarvelService
import com.rbelchior.marvel.di.IoDispatcher
import com.rbelchior.marvel.domain.Character
import com.rbelchior.marvel.domain.Resource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map

class CharactersRepository(
    private val database: SuperHeroesDatabase,
    private val marvelService: MarvelService,
    @IoDispatcher
    private val ioDispatcher: CoroutineDispatcher
) {
    private val characterDao = database.characterDao()

    @ExperimentalPagingApi
    fun getPagedCharacters(searchQuery: String) = Pager(
        config = PagingConfig(pageSize = 30),
        remoteMediator = PagingRemoteMediator(searchQuery, database, marvelService)
    ) { characterDao.getPages(searchQuery) }
        .flow
        .map { pd -> pd.map { entity -> entity.toModel() } }

    /**
     * Get character from DB only.
     */
    fun getCharacter(id: Long): Flow<Character> {
        return characterDao
            .getById(id)
            .map { it.toModel() }
            .flowOn(ioDispatcher)
    }

}
