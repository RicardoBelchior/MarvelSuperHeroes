package com.rbelchior.marvel.ui.character.list.adapter

import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter

class CharactersLoadStateAdapter(
    private val retry: () -> Unit
) : LoadStateAdapter<CharactersLoadStateViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        loadState: LoadState
    ) = CharactersLoadStateViewHolder(parent, retry)

    override fun onBindViewHolder(
        holder: CharactersLoadStateViewHolder,
        loadState: LoadState
    ) = holder.bind(loadState)

}
