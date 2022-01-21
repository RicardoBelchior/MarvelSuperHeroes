package com.rbelchior.marvel.ui.character.list

import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadState
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.shape.MaterialShapeDrawable
import com.rbelchior.marvel.R
import com.rbelchior.marvel.databinding.FragmentCharacterListBinding
import com.rbelchior.marvel.ui.character.list.adapter.CharactersListAdapter
import com.rbelchior.marvel.ui.character.list.adapter.CharactersLoadStateAdapter
import com.rbelchior.marvel.ui.character.list.adapter.GridSpacingItemDecoration
import com.rbelchior.marvel.ui.ext.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.distinctUntilChangedBy
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagingApi::class)
@ExperimentalCoroutinesApi
@AndroidEntryPoint
class CharactersListFragment : Fragment(R.layout.fragment_character_list) {

    private val binding by viewBinding(FragmentCharacterListBinding::bind)
    private val viewModel: CharactersListViewModel by viewModels()
    private val adapter = CharactersListAdapter()

    override fun onViewCreated(view: View, bundle: Bundle?) {
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
        binding.appBarLayout.statusBarForeground =
            MaterialShapeDrawable.createWithElevationOverlay(requireContext())

        setupList()
        setupSearch()

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {

                launch {
                    viewModel.characters
                        .collectLatest { adapter.submitData(it) }
                }

                launch {
                    adapter.loadStateFlow.collectLatest { loadStates ->
                        binding.swipeRefreshLayout.isRefreshing =
                            loadStates.mediator?.refresh is LoadState.Loading
                    }
                }

                launch {
                    adapter.loadStateFlow
                        .distinctUntilChangedBy { it.refresh }
                        .filter { it.refresh is LoadState.NotLoading }
                        .collectLatest { binding.recyclerView.scrollToPosition(0) }
                }
            }
        }
    }

    private fun setupList() {
        binding.swipeRefreshLayout.setOnRefreshListener { adapter.refresh() }

        val spanCount = 3
        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), spanCount)
        binding.recyclerView.addItemDecoration(
            GridSpacingItemDecoration(
                spanCount, resources.getDimensionPixelSize(R.dimen.viewMargin), true
            )
        )
        binding.recyclerView.adapter = adapter.withLoadStateFooter(
            CharactersLoadStateAdapter(adapter::retry)
        )
    }

    private fun setupSearch() {
        binding.etSearch.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_GO) {
                updateSearchQuery()
                true
            } else {
                false
            }
        }
        binding.etSearch.setOnKeyListener { _, keyCode, event ->
            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                updateSearchQuery()
                true
            } else {
                false
            }
        }
    }

    private fun updateSearchQuery() {
        binding.etSearch.text.trim().toString().let {
            viewModel.setSearch(it)
        }
    }

}
