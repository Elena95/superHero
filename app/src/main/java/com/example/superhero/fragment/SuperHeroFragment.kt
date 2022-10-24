package com.example.superhero.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.superhero.adapter.SuperHeroAdapter
import com.example.superhero.data.entities.SuperHero
import com.example.superhero.databinding.SuperHeroFragmentBinding
import com.example.superhero.viewmodel.SuperHeroesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SuperHeroFragment : Fragment() {
    private lateinit var binding: SuperHeroFragmentBinding
    private val viewModel: SuperHeroesViewModel by viewModels()
    private lateinit var superHeroAdapter: SuperHeroAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var navController: NavController
    private var listResult = mutableListOf<SuperHero>()
    private var lastVisibleItemPosition: Int = 0
    private lateinit var scrollListener: RecyclerView.OnScrollListener


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SuperHeroFragmentBinding.inflate(inflater, container, false)
        layoutManager = LinearLayoutManager(context)
        navController = findNavController()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        superHeroAdapter = SuperHeroAdapter(SuperHeroAdapter.OnClickListener {
            navController.navigate(
                SuperHeroFragmentDirections.actionHeroesFragmentToDetailScreenFragment(
                    it,
                    it.name
                )
            )
        })
        binding.mRecyclerView.adapter = superHeroAdapter
        viewModel.loadPage.observe(viewLifecycleOwner, Observer { loadPage ->
            if (loadPage) {
                setRecyclerViewScrollListener()
            }
        })

        viewModel.getSuperHero()
        observeViewModel()
    }

    //Funcion que nos permitira detectar los scrolls, para poder hacer la peticion de los siguientes 5 elementos
    private fun setRecyclerViewScrollListener() {
        scrollListener = object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView!!, newState)
                val totalItemCount = recyclerView!!.layoutManager!!.itemCount
                lastVisibleItemPosition =
                    (binding.mRecyclerView.layoutManager as LinearLayoutManager).findLastVisibleItemPosition()
                if (totalItemCount == lastVisibleItemPosition + 1) {
                    viewModel.nextPage()
                    binding.mRecyclerView.removeOnScrollListener(scrollListener)
                }
            }
        }
        binding.mRecyclerView.addOnScrollListener(scrollListener)
    }

    //Observaremos el resultado quien nos traera la informacion del viewModel de la peticion, agregandolo a una lista para mostrarlo con ayuda del adapter
    private fun observeViewModel() {
        viewModel.result.observe(viewLifecycleOwner) {
            it?.let {
                listResult.clear()
                listResult.addAll(it)
                if (it.isNotEmpty()) {
                    superHeroAdapter.submitList(listResult.toList())
                }
            }
        }

    }

}