package com.example.superhero.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.superhero.data.entities.BiographyInfo
import com.example.superhero.data.entities.usecase.GetBiographyUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BiographyViewModel @Inject constructor(val getBiographyUseCase: GetBiographyUseCase) :
    ViewModel(
    ) {

    private val biography = MutableLiveData<BiographyInfo>()
    val result: LiveData<BiographyInfo> get() = biography

    fun getBiography(id: Int) {
        viewModelScope.launch {
            val result = getBiographyUseCase.invoke(id)
            biography.postValue(result)
        }
    }
}
