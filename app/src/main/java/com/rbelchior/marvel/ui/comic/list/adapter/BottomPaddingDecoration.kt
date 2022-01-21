package com.rbelchior.marvel.ui.comic.list.adapter

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.rbelchior.marvel.R

/**
 * Adds 8dp padding to the top of the first and the bottom of the last item in the list,
 * as specified in https://www.google.com/design/spec/components/lists.html#lists-specs
 */
class BottomPaddingDecoration(private val context: Context) : ItemDecoration() {
    private val margin = context.resources.getDimensionPixelSize(R.dimen.rvBottomMargin)

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val itemPosition = parent.getChildAdapterPosition(view)
        if (itemPosition == RecyclerView.NO_POSITION) {
            return
        }
        val adapter = parent.adapter
        if (adapter != null && itemPosition == adapter.itemCount - 1) {
            outRect.bottom = margin
        }
    }

}
