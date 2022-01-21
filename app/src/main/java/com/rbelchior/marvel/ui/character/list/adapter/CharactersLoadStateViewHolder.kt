package com.rbelchior.marvel.ui.character.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.recyclerview.widget.RecyclerView
import com.rbelchior.marvel.R
import com.rbelchior.marvel.databinding.CharactersLoadStateItemBinding
import com.rbelchior.marvel.ui.ext.showSnackBarMessage

class CharactersLoadStateViewHolder(
    val parent: ViewGroup,
    retry: () -> Unit
) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context)
        .inflate(R.layout.characters_load_state_item, parent, false)
) {
    private val binding = CharactersLoadStateItemBinding.bind(itemView)

    init {
        binding.retryButton.setOnClickListener { retry() }
    }

    fun bind(loadState: LoadState) {
        if (loadState is LoadState.Error) {
            parent.showSnackBarMessage(loadState.error.message ?: "Error loading data")
        }

        binding.progressBar.isVisible = loadState is LoadState.Loading
        binding.retryButton.isVisible = loadState is LoadState.Error
    }
}
