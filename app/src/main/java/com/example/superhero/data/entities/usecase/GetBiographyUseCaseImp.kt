package com.example.superhero.data.entities.usecase

import com.example.superhero.data.entities.BiographyInfo
import com.example.superhero.repository.Repository
import javax.inject.Inject

class GetBiographyUseCaseImp @Inject constructor(private val repository: Repository) :
    GetBiographyUseCase {
    override suspend operator fun invoke(id: Int): BiographyInfo = repository.getBiography(id)
}
