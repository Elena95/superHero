package com.example.superhero.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.superhero.data.entities.PowerStatsInfo
import com.example.superhero.data.entities.usecase.GetStatsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PowerStatsViewModel @Inject constructor(val getStatsUseCase: GetStatsUseCase) : ViewModel(
) {
    private val powerstats = MutableLiveData<PowerStatsInfo>()
    val result: LiveData<PowerStatsInfo> get() = powerstats

    fun getPowerStats(id: Int) {
        viewModelScope.launch {
            val result = getStatsUseCase.invoke(id)
            powerstats.postValue(result)
        }
    }
}