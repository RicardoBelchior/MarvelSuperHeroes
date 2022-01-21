package com.rbelchior.marvel.ui.character.detail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.chip.Chip
import com.rbelchior.marvel.R
import com.rbelchior.marvel.databinding.FragmentCharacterDetailBinding
import com.rbelchior.marvel.ui.comic.list.ComicsListFragmentArgs
import com.rbelchior.marvel.ui.ext.showSnackBarMessage
import com.rbelchior.marvel.ui.ext.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import logcat.logcat


@AndroidEntryPoint
class CharacterDetailFragment : Fragment(R.layout.fragment_character_detail) {

    private val binding by viewBinding(FragmentCharacterDetailBinding::bind)
    private val viewModelCharacter: CharacterDetailViewModel by viewModels()
    private val args: CharacterDetailFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModelCharacter.fetch(args.characterId)
    }

    override fun onViewCreated(view: View, bundle: Bundle?) {
        setupEdgeToEdge(view)
        setupToolbar()

        viewLifecycleOwner.lifecycleScope.launch {
            viewModelCharacter.uiState
                .flowWithLifecycle(lifecycle, Lifecycle.State.STARTED)
                .collectLatest { uiState -> render(uiState) }
        }
    }

    private fun render(uiState: DetailUiState) {
        logcat { uiState.toString() }

        // Show/hide progress bar
        binding.progressBar.isVisible = uiState.isLoading

        // Show any possible error message
        uiState.userMessages.firstOrNull()?.let {
            showSnackBarMessage(it)
        }

        uiState.character?.let {
            binding.tvTitle.text = it.name

            binding.tvDescription.text = it.description
            binding.tvDescription.isVisible = it.description.isNotEmpty()

            val url = it.urls.getFirst()
            binding.btnOpenInBrowser.isVisible = it.description.isNotEmpty() && url.isNotEmpty()
            binding.btnOpenInBrowser.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
            }

            binding.ivAvatar.contentDescription = "Image for ${it.name}"
            Glide.with(binding.ivAvatar)
                .load(it.thumbnailUrl)
                .centerCrop()
                .into(binding.ivAvatar)

            setupChip(binding.chipComics, R.string.chip_comics, it.comicsAvailable) { _ ->
                findNavController()
                    .navigate(
                        R.id.action_DetailFragment_to_ComicsListFragment,
                        ComicsListFragmentArgs(it.id).toBundle()
                    )
            }
            // We don't handle clicks for the remaining chips, yet.
            setupChip(binding.chipSeries, R.string.chip_series, it.seriesAvailable)
            setupChip(binding.chipStories, R.string.chip_stories, it.storiesAvailable)
            setupChip(binding.chipEvents, R.string.chip_events, it.eventsAvailable)
        }
    }

    private fun setupChip(
        chipView: Chip,
        stringRes: Int,
        itemsAvailable: Int,
        onClick: (View) -> Unit = {}
    ) {
        chipView.text = getString(stringRes, itemsAvailable)
        chipView.isVisible = itemsAvailable > 0
        chipView.setOnClickListener { onClick(it) }
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
