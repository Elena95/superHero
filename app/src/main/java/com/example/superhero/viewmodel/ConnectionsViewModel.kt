package com.example.superhero.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.superhero.data.entities.ConnectionsInfo
import com.example.superhero.data.entities.usecase.GetConnectionsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ConnectionsViewModel @Inject constructor(val getConnectionsUseCase: GetConnectionsUseCase) :
    ViewModel(
    ) {

    private val connections = MutableLiveData<ConnectionsInfo>()
    val result: LiveData<ConnectionsInfo> get() = connections

    fun getConnections(id: Int) {
        viewModelScope.launch {
            val result = getConnectionsUseCase.invoke(id)
            connections.postValue(result)
        }
    }
}