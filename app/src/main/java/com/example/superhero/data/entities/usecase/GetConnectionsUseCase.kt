package com.example.superhero.data.entities.usecase

import com.example.superhero.data.entities.ConnectionsInfo

interface GetConnectionsUseCase {
    suspend operator fun invoke(id: Int): ConnectionsInfo
}
