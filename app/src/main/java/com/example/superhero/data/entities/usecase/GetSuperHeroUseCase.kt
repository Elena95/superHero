package com.example.superhero.data.entities.usecase

import com.example.superhero.data.entities.SuperHero

interface GetSuperHeroUseCase {
    suspend operator fun invoke(id: Int): SuperHero
}