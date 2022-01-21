package com.rbelchior.marvel.data.remote

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.rbelchior.marvel.data.remote.Mapper.toModel
import com.rbelchior.marvel.domain.Character

class RemotePagingSource(
    private val marvelService: MarvelService
) : PagingSource<Int, Character>() {

    override suspend fun load(
        params: LoadParams<Int>
    ): LoadResult<Int, Character> {
        return try {
            val limit = params.loadSize
            val offset = params.key ?: 0
            val response = marvelService.getCharacters(limit, offset)
            val nextKey = offset + response.data!!.count!!

            LoadResult.Page(response.toModel(), null, nextKey)
        } catch (e: Exception) {
            // Handle errors in this block and return LoadResult.Error if it is an
            // expected error (such as a network failure).
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, Character>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            // This loads starting from previous page, but since PagingConfig.initialLoadSize spans
            // multiple pages, the initial load will still load items centered around
            // anchorPosition. This also prevents needing to immediately launch prepend due to
            // prefetchDistance.
            state.closestPageToPosition(anchorPosition)?.prevKey
        }

    }

}
