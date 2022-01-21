package com.rbelchior.marvel.ui.character.list

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asFlow
import androidx.lifecycle.viewModelScope
import androidx.paging.ExperimentalPagingApi
import androidx.paging.cachedIn
import com.rbelchior.marvel.data.CharactersRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flatMapLatest
import javax.inject.Inject

@HiltViewModel
class CharactersListViewModel @Inject constructor(
    charactersRepository: CharactersRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    companion object {
        const val KEY_SEARCH_QUERY = "search_query"
    }

    init {
        if (!savedStateHandle.contains(KEY_SEARCH_QUERY)) {
            savedStateHandle.set(KEY_SEARCH_QUERY, "")
        }
    }

    @ExperimentalPagingApi
    @ExperimentalCoroutinesApi
    val characters = savedStateHandle.getLiveData<String>(KEY_SEARCH_QUERY)
        .asFlow()
        .flatMapLatest { searchQuery -> charactersRepository.getPagedCharacters(searchQuery) }
        .cachedIn(viewModelScope)

    fun setSearch(searchQuery: String) {
        if (!shouldShowQuery(searchQuery)) return
        savedStateHandle.set(KEY_SEARCH_QUERY, searchQuery)
    }

    private fun shouldShowQuery(searchQuery: String): Boolean {
        return savedStateHandle.get<String>(KEY_SEARCH_QUERY) != searchQuery
    }


}
