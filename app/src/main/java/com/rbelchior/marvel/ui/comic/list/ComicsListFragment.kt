package com.rbelchior.marvel.ui.comic.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.rbelchior.marvel.databinding.FragmentComicsListBinding
import com.rbelchior.marvel.ui.comic.list.adapter.BottomPaddingDecoration
import com.rbelchior.marvel.ui.comic.list.adapter.ComicsListAdapter
import com.rbelchior.marvel.ui.ext.showSnackBarMessage
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import logcat.logcat

@AndroidEntryPoint
class ComicsListFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentComicsListBinding? = null
    private val binding get() = _binding!!
    private val viewModel: ComicsListViewModel by viewModels()
    private val args: ComicsListFragmentArgs by navArgs()
    private val adapter = ComicsListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.fetch(args.characterId)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentComicsListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.rvComicsList.layoutManager = LinearLayoutManager(requireContext())
        binding.rvComicsList.adapter = adapter
        binding.rvComicsList.addItemDecoration(BottomPaddingDecoration(requireContext()))

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.uiState
                .flowWithLifecycle(lifecycle, Lifecycle.State.STARTED)
                .collectLatest { uiState -> render(uiState) }
        }
    }

    private fun render(uiState: ComicsListUiState) {
        logcat { uiState.toString() }

        // Show/hide progress bar
        binding.progressBar.isVisible = uiState.isLoading

        // Show any possible error message
        uiState.userMessages.firstOrNull()?.let {
            showSnackBarMessage(it)
        }

        // Update the recyclerview adapter
        adapter.submitList(uiState.comics)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}