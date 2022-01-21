package com.rbelchior.marvel.data

import com.rbelchior.marvel.data.remote.Mapper.toModel
import com.rbelchior.marvel.data.remote.MarvelService
import com.rbelchior.marvel.domain.Comic
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext

class ComicsRepository(
    private val marvelService: MarvelService,
    private val externalScope: CoroutineScope
) {

    // Mutex to make writes to cached values thread-safe.
    private val comicsMutex = Mutex()

    // Cache of the latest comics received from the network.
    private val comicsCache = mutableMapOf<Long, Comic>()
    private val characterComicsCache = mutableMapOf<Long, List<Comic>>()


    private suspend fun getCharacterComicsInternal(
        id: Long,
        refresh: Boolean = false
    ): List<Comic> {
        return if (refresh || comicsMutex.withLock { !characterComicsCache.containsKey(id) }) {
            withContext(externalScope.coroutineContext) {
                marvelService.getCharacterComics(id, 100, 0)
                    .toModel()
                    .also { comicsList ->
                        comicsMutex.withLock {
                            characterComicsCache[id] = comicsList
                            comicsList.forEach { comic -> comicsCache[comic.id] = comic }
                        }
                    }
            }
        } else {
            return comicsMutex.withLock { characterComicsCache[id]!! }
        }
    }

    fun getCharacterComics(id: Long, refresh: Boolean = false): Flow<List<Comic>> {
        return flow {
            emit(getCharacterComicsInternal(id, refresh))
        }
    }

    fun getComic(id: Long, refresh: Boolean = false): Flow<Comic> {
        return flow {
            comicsMutex.withLock { emit(comicsCache[id]!!) }
        }
    }
}