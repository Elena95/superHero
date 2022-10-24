package com.example.superhero.data.entities.usecase

import com.example.superhero.data.entities.AppearanceInfo
import com.example.superhero.repository.Repository
import javax.inject.Inject

class GetAppearanceUseCaseImp @Inject constructor(private val repository: Repository) :
    GetAppearanceUseCase {
    override suspend operator fun invoke(id: Int): AppearanceInfo = repository.getAppearance(id)
}
