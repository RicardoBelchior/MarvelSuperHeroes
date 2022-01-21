package com.rbelchior.marvel.ui.comic.list

import com.rbelchior.marvel.domain.Comic

data class ComicsListUiState(
    val isLoading: Boolean = false,
    val comics: List<Comic> = emptyList(),
    val userMessages: List<String> = emptyList()
)
