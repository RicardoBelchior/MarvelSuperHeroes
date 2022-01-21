package com.rbelchior.marvel.ui.character.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rbelchior.marvel.data.CharactersRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterDetailViewModel @Inject constructor(
    private val charactersRepository: CharactersRepository,
    private val state: SavedStateHandle
) : ViewModel() {

    private val _uiState = MutableStateFlow(DetailUiState(isLoading = true))
    val uiState: StateFlow<DetailUiState> = _uiState.asStateFlow()

    private var fetchJob: Job? = null

    fun fetch(id: Long) {
        fetchJob?.cancel()
        fetchJob = viewModelScope.launch {
            charactersRepository.getCharacter(id)
                .catch { throwable ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            userMessages = listOf(throwable.message ?: "Unknown error")
                        )
                    }
                }
                .collect { character ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            character = character,
                        )
                    }
                }
        }
    }
}
