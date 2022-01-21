package com.rbelchior.marvel.ui.character.list.adapter

import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rbelchior.marvel.R
import com.rbelchior.marvel.databinding.ListItemCharacterBinding
import com.rbelchior.marvel.domain.Character
import com.rbelchior.marvel.ui.character.detail.CharacterDetailFragmentArgs

class CharacterViewHolder(
    private val binding: ListItemCharacterBinding
) :
    RecyclerView.ViewHolder(binding.root) {

    private var character: Character? = null

    init {
        itemView.setOnClickListener {
            character?.let {
                itemView.findNavController()
                    .navigate(
                        R.id.action_ListFragment_to_DetailFragment,
                        CharacterDetailFragmentArgs(it.id).toBundle()
                    )
            }
        }
    }

    fun bind(character: Character) {
        this.character = character

        binding.tvTitle.text = character.name
        binding.tvTitle.background = null

        binding.ivAvatar.contentDescription = "Image for ${character.name}"
        binding.ivAvatar.setImageDrawable(null)
        Glide.with(binding.ivAvatar)
            .load(character.thumbnailUrl)
            .centerCrop()
            .into(binding.ivAvatar)
    }

    fun showPlaceholder() {
        this.character = null

        binding.tvTitle.text = null
        binding.tvTitle.setBackgroundResource(R.drawable.text_placeholder)

        Glide.with(binding.ivAvatar).clear(binding.ivAvatar)
        binding.ivAvatar.setImageResource(R.drawable.image_placeholder)
    }

}
