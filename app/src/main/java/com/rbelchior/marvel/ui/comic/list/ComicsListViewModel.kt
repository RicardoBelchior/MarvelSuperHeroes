package com.rbelchior.marvel.ui.comic.list

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rbelchior.marvel.data.ComicsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ComicsListViewModel @Inject constructor(
    private val comicsRepository: ComicsRepository,
    private val state: SavedStateHandle
) : ViewModel() {

    private val _uiState = MutableStateFlow(ComicsListUiState(isLoading = true))
    val uiState: StateFlow<ComicsListUiState> = _uiState.asStateFlow()

    private var fetchJob: Job? = null

    fun fetch(characterId: Long) {
        fetchJob?.cancel()
        fetchJob = viewModelScope.launch {
            comicsRepository.getCharacterComics(characterId)
                .catch { throwable ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            userMessages = listOf(throwable.message ?: "Unknown error")
                        )
                    }
                }
                .collect { comics ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            comics = comics,
                        )
                    }
                }
        }
    }
}
