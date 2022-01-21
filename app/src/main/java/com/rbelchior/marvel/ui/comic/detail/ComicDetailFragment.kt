package com.rbelchior.marvel.ui.comic.detail

import android.graphics.RenderEffect
import android.graphics.Shader
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updateLayoutParams
import androidx.core.view.updatePadding
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.rbelchior.marvel.R
import com.rbelchior.marvel.databinding.FragmentComicDetailBinding
import com.rbelchior.marvel.domain.Comic
import com.rbelchior.marvel.ui.ext.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


@AndroidEntryPoint
class ComicDetailFragment : Fragment(R.layout.fragment_comic_detail) {

    private val binding by viewBinding(FragmentComicDetailBinding::bind)
    private val viewModel: ComicDetailViewModel by viewModels()
    private val args: ComicDetailFragmentArgs by navArgs()

    override fun onViewCreated(view: View, bundle: Bundle?) {
        setupEdgeToEdge(view)
        setupToolbar()

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.getComic(args.comicId)
                .flowWithLifecycle(lifecycle, Lifecycle.State.STARTED)
                .collectLatest { render(it) }
        }
    }

    private fun render(comic: Comic) {
        binding.tvTitle.text = comic.title
        binding.tvDescription.text = comic.description

        binding.tvPubDateValue.text = comic.getPrettyPublishedDate()
        binding.tvWriterValue.text = comic.getWriterName()

        binding.ivAvatar.contentDescription = "Image for ${comic.title}"
        Glide.with(binding.ivAvatar)
            .load(comic.thumbnailUrl)
            .fitCenter()
            .into(binding.ivAvatar)

        // Display a blurred background for a nicer effect
        Glide.with(binding.ivAvatarBackground)
            .load(comic.thumbnailUrl)
            .centerCrop()
            .addListener(object : RequestListener<Drawable> {
                override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Drawable>?, isFirstResource: Boolean): Boolean {
                    return false
                }
                override fun onResourceReady(resource: Drawable?, model: Any?, target: Target<Drawable>?, dataSource: DataSource?, isFirstResource: Boolean): Boolean {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {

                        binding.ivAvatarBackground.setRenderEffect(
                            RenderEffect.createBlurEffect(200f, 200f, Shader.TileMode.CLAMP))
                    }
                    return false
                }
            })
            .into(binding.ivAvatarBackground)


    }

    private fun setupToolbar() {
        binding.toolbar.setNavigationOnClickListener { v ->
            v.findNavController().popBackStack()
        }
    }

    private fun setupEdgeToEdge(view: View) {
        ViewCompat.setOnApplyWindowInsetsListener(view) { _, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            binding.toolbar.updateLayoutParams<CollapsingToolbarLayout.LayoutParams> {
                topMargin = systemBars.top
            }
            // The collapsed app bar gets taller by the toolbar's top margin. The CoordinatorLayout
            // has to have a bottom margin of the same amount so that the scrolling content is
            // completely visible.
            binding.nestedScrollView.updateLayoutParams<CoordinatorLayout.LayoutParams> {
                bottomMargin = systemBars.top
            }
            binding.clContent.updatePadding(
                left = systemBars.left,
                right = systemBars.right,
                bottom = systemBars.bottom
            )
            insets
        }
    }
}
