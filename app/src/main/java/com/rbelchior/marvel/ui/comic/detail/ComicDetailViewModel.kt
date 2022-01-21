package com.rbelchior.marvel.ui.comic.detail

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
class ComicDetailViewModel @Inject constructor(
    private val comicsRepository: ComicsRepository,
    private val state: SavedStateHandle
) : ViewModel() {

    // Simplifying things a little here
    fun getComic(id: Long) = comicsRepository.getComic(id)
}
