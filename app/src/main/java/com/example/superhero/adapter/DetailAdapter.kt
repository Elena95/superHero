package com.example.superhero.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.superhero.data.entities.SuperHero
import com.example.superhero.fragment.*

//Crear fragmentos para el ViewPager
class DetailAdapter(fm: Fragment, args: SuperHero) :
    FragmentStateAdapter(fm) {

    private val pages = listOf(
        PowerStatsFragment().getInstance(args),
        BiographyFragment().getInstance(args),
        AppearanceFragment().getInstance(args),
        ConnectionsFragment().getInstance(args)
    )

    override fun createFragment(position: Int): Fragment {
        return pages[position]
    }

    override fun getItemCount(): Int {
        return pages.size
    }
}


