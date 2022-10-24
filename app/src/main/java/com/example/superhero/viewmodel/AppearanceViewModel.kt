package com.example.superhero.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.superhero.data.entities.AppearanceInfo
import com.example.superhero.data.entities.usecase.GetAppearanceUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AppearanceViewModel @Inject constructor(val getUsesCaseAppearance: GetAppearanceUseCase) :
    ViewModel(
    ) {

    private val appearance = MutableLiveData<AppearanceInfo>()
    //variables que observaremos en el fragment para compartir data
    val result: LiveData<AppearanceInfo> get() = appearance

    //Obtenemos la data de Appearance utilizando coroutinas
    fun getAppearance(id: Int) {
        viewModelScope.launch {
            val result = getUsesCaseAppearance.invoke(id)
            appearance.postValue(result)
        }
    }
}