package com.example.superhero.data.entities.usecase

import com.example.superhero.data.entities.ConnectionsInfo
import com.example.superhero.repository.Repository
import javax.inject.Inject


class GetConnectionsUseCaseImp @Inject constructor(private val repository: Repository) :
    GetConnectionsUseCase {
    override suspend operator fun invoke(id: Int): ConnectionsInfo = repository.getConnections(id)
}
