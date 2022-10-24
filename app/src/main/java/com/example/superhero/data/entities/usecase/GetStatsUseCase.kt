package com.example.superhero.data.entities.usecase

import com.example.superhero.data.entities.PowerStatsInfo

interface GetStatsUseCase {
    suspend operator fun invoke(id: Int): PowerStatsInfo
}

