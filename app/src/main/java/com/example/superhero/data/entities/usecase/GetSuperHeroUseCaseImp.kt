package com.example.superhero.data.entities.usecase

import com.example.superhero.data.entities.SuperHero
import com.example.superhero.repository.Repository
import javax.inject.Inject

class GetSuperHeroUseCaseImp @Inject constructor(private val repository: Repository) :
    GetSuperHeroUseCase {
    override suspend operator fun invoke(id: Int): SuperHero = repository.getSuperHero(id)
}
