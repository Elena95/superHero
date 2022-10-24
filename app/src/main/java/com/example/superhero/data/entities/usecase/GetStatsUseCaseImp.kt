package com.example.superhero.data.entities.usecase

import com.example.superhero.data.entities.PowerStatsInfo
import com.example.superhero.repository.Repository
import javax.inject.Inject

class GetStatsUseCaseImp @Inject constructor(private val repository: Repository) : GetStatsUseCase {
    override suspend operator fun invoke(id: Int): PowerStatsInfo = repository.getPowerStats(id)
}
