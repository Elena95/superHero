package com.example.superhero.data.entities.usecase

import com.example.superhero.data.entities.BiographyInfo

interface GetBiographyUseCase {
    suspend operator fun invoke(id: Int): BiographyInfo
}



