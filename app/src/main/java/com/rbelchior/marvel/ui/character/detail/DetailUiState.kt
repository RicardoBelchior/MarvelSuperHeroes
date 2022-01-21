package com.rbelchior.marvel.ui.character.detail

import com.rbelchior.marvel.domain.Character

data class DetailUiState(
    val isLoading: Boolean = false,
    val character: Character? = null,
    val userMessages: List<String> = emptyList()
)
