package com.example.superhero.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.superhero.viewmodel.BiographyViewModel
import com.example.superhero.data.entities.SuperHero
import com.example.superhero.databinding.BiographyFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BiographyFragment : Fragment() {
    private lateinit var binding: BiographyFragmentBinding
    private val viewModel: BiographyViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BiographyFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        infoBiography()
        setUpObservers()
    }

    private fun setUpObservers() {
        viewModel.result.observe(viewLifecycleOwner) {
            binding.tvItemFullName.text = it.full_name
            binding.tvItemEgos.text = it.alter_egos
            binding.tvItemAliases.text = it.aliases.toString()
            binding.tvItemBirth.text = it.place_of_birth
            binding.tvItemAppearence.text = it.first_appearance
            binding.tvItemPublisher.text = it.publisher
        }
    }

    fun infoBiography() {
        var id = arguments?.getInt("id")
        if (id == null) {
            id = 0
        }
        viewModel.getBiography(id)
    }

    fun getInstance(args: SuperHero): BiographyFragment {
        val fragment = BiographyFragment()
        val bundle = Bundle()
        bundle.putInt("id", args.id)
        fragment.arguments = bundle
        return fragment
    }
}



