package com.example.superhero.fragment

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.example.superhero.adapter.DetailAdapter
import com.example.superhero.data.entities.SuperHero
import com.example.superhero.databinding.DetailFragmentBinding
import com.example.superhero.viewmodel.PowerStatsViewModel
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint


val title = arrayOf(
    "PowerStats",
    "Biography",
    "Appearance",
    "Connections"
)

@AndroidEntryPoint
class DetailFragment : Fragment() {
    private lateinit var binding: DetailFragmentBinding
    private val args: DetailFragmentArgs by navArgs()
    private lateinit var navController: NavController
    private var _resultSuperHero = MutableLiveData<SuperHero>()
    val superHero: LiveData<SuperHero> = _resultSuperHero

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        navController = findNavController()
        binding = DetailFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Compartir super hero seleccionado al DetailAdapter para obtener futura infromacion
        val adapter = DetailAdapter(this, args.superHero)
        //Creando ViewPager con el TabLayout
        val viewPager: ViewPager2 = binding.viewPager
        viewPager.adapter = adapter
        val tabLayout = binding.tabLayout
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = title[position]
        }.attach()
        infoHero(args.superHero)

    }
//Mostrando informacion en el fragmento
    fun infoHero(superHero: SuperHero) = with(binding) {
        tvOcupationText.text = superHero.work.occupation
        tvBaseText.text = superHero.work.base
        Glide.with(binding.root.context)
            .load(superHero.image.url)
            .into(imageHeroe)
    }

}




