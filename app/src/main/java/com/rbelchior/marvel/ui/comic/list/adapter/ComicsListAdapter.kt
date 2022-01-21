package com.rbelchior.marvel.ui.comic.list.adapter

import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.MarginLayoutParams
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.rbelchior.marvel.R
import com.rbelchior.marvel.domain.Comic
import com.rbelchior.marvel.ui.comic.detail.ComicDetailFragmentArgs
import com.rbelchior.marvel.ui.ext.getActivity

class ComicsListAdapter : ListAdapter<Comic, ComicsListAdapter.ComicViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicViewHolder {
        val style = R.style.Widget_Material3_Button_OutlinedButton
        val button = MaterialButton(ContextThemeWrapper(parent.context, style))
        return ComicViewHolder(button)
    }

    override fun onBindViewHolder(holder: ComicViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Comic>() {
            override fun areItemsTheSame(oldItem: Comic, newItem: Comic): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Comic, newItem: Comic): Boolean {
                return true
            }
        }
    }

    class ComicViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var comic: Comic

        init {
            itemView.setOnClickListener {
                getNavController()
                    .navigate(
                        R.id.action_ComicsList_to_ComicDetail,
                        ComicDetailFragmentArgs(comic.id).toBundle()
                    )
            }
            itemView.layoutParams = MarginLayoutParams(
                MarginLayoutParams.WRAP_CONTENT,
                MarginLayoutParams.WRAP_CONTENT
            ).apply {
                marginStart = itemView.resources.getDimensionPixelSize(R.dimen.viewMarginLarge)
            }
        }

        fun bind(comic: Comic) {
            this.comic = comic
            (itemView as Button).text = comic.title
        }

        private fun getNavController() =
            itemView.context.getActivity()!!
                .findNavController(R.id.nav_host_fragment_content_main)

    }
}

