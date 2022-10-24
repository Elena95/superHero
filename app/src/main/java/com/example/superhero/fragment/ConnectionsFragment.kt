package com.example.superhero.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.superhero.data.entities.SuperHero
import com.example.superhero.databinding.ConnectionsFragmentBinding
import com.example.superhero.viewmodel.ConnectionsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ConnectionsFragment : Fragment() {
    private lateinit var binding: ConnectionsFragmentBinding
    private val viewModel: ConnectionsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ConnectionsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        infoConnections()
        setUpObservers()
    }


    private fun setUpObservers() {
        viewModel.result.observe(viewLifecycleOwner) {
            binding.tvDescripGrooup.text = it.group_affiliation
            binding.tvDescripRelatives.text = it.relatives
        }
    }

    fun infoConnections() {
        var id = arguments?.getInt("id")
        if (id == null) {
            id = 0
        }
        viewModel.getConnections(id)
    }

    fun getInstance(args: SuperHero): ConnectionsFragment {
        val fragment = ConnectionsFragment()
        val bundle = Bundle()
        bundle.putInt("id", args.id)
        fragment.arguments = bundle
        return fragment
    }
}