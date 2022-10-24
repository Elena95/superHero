package com.example.superhero.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.superhero.data.entities.SuperHero
import com.example.superhero.databinding.PowerstatsFragmentBinding
import com.example.superhero.viewmodel.PowerStatsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PowerStatsFragment() : Fragment() {
    private lateinit var binding: PowerstatsFragmentBinding
    private val viewModel: PowerStatsViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = PowerstatsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        infoPowerStats()
        setUpObservers()
    }

    private fun setUpObservers() {
        viewModel.result.observe(viewLifecycleOwner) {
            binding.tvItemIntelligence.text = it.intelligence
            binding.tvItemStrength.text = it.strength
            binding.tvItemSpeed.text = it.speed
            binding.tvItemDurability.text = it.durability
            binding.tvItemPower.text = it.power
            binding.tvItemCombat.text = it.combat
        }
    }

    fun infoPowerStats() {
        var id = arguments?.getInt("id")
        if (id == null) {
            id = 0
        }
        viewModel.getPowerStats(id)
    }


    fun getInstance(args: SuperHero): PowerStatsFragment {
        val fragment = PowerStatsFragment()
        val bundle = Bundle()
        bundle.putInt("id", args.id)
        fragment.arguments = bundle
        return fragment
    }

}

