package com.example.superhero.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.superhero.data.entities.SuperHero
import com.example.superhero.databinding.AppearanceFragmentBinding
import com.example.superhero.viewmodel.AppearanceViewModel
import dagger.hilt.android.AndroidEntryPoint

//Fragmento que mostrara data de Appearance
@AndroidEntryPoint
class AppearanceFragment : Fragment() {
    private lateinit var binding: AppearanceFragmentBinding
    private val viewModel: AppearanceViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = AppearanceFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        infoAppearance()
        setUpObservers()
    }

    //Observar el cambio de result y asignar valores a la vista
    private fun setUpObservers() {
        viewModel.result.observe(viewLifecycleOwner) {
            binding.tvItemGender.text = it.gender
            binding.tvItemRace.text = it.race
            binding.tvItemHeight.text = it.height.toString()
            binding.tvItemWeight.text = it.weight.toString()
            binding.tvItemEyeColor.text = it.eye_color
            binding.tvItemHairColor.text = it.hair_color
        }
    }

    //Invocar funcion de viewModel para traer data de appearance
    fun infoAppearance() {
        var id = arguments?.getInt("id")
        if (id == null) {
            id = 0
        }
        viewModel.getAppearance(id)
    }

    //Traer id previamente guardado del adapter de detalle
    fun getInstance(args: SuperHero): AppearanceFragment {
        val fragment = AppearanceFragment()
        val bundle = Bundle()
        bundle.putInt("id", args.id)
        fragment.arguments = bundle
        return fragment
    }
}