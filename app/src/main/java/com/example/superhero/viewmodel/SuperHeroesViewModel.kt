package com.example.superhero.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.superhero.data.entities.SuperHero
import com.example.superhero.data.entities.usecase.GetSuperHeroUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SuperHeroesViewModel @Inject constructor(
    val getSuperHeroUseCase: GetSuperHeroUseCase
) : ViewModel() {
    var init: Int = 1
    var limit: Int = 5
    private val _resultData = MutableLiveData<List<SuperHero>>()
    val result: LiveData<List<SuperHero>> = _resultData
    private var listSuperHero = mutableListOf<SuperHero>()
    val loadPage = MutableLiveData<Boolean>()


    fun getSuperHero() {
        viewModelScope.launch {
            try {
                //Realizo peticiones de 5 en 5 para mostrar en el fragment
                for (init in init..limit) {
                    val resultSuper = getSuperHeroUseCase(init)
                    listSuperHero.add(resultSuper)
                }
                //Una vez obtenida la informacion completa lo paso a _resultData para compartir con SuperHeroFragment
                _resultData.postValue(listSuperHero)
                //Activo el listener del Scroll
                loadPage.value = true
            } catch (ex: Exception) {
                onFailureGetHeroes(ex)
            }
        }
    }


    fun onFailureGetHeroes(it: Throwable) {
        print("Error $it")
    }

    fun nextPage() {
        //Desactivo listener de scroll
        loadPage.value = false
        //prepara para pedir los siguientes 5 elementos
        init += limit
        limit += limit
        getSuperHero()
    }

}



