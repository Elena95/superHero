package com.example.superhero.data.entities.usecase

import com.example.superhero.data.entities.AppearanceInfo

interface GetAppearanceUseCase {
    suspend operator fun invoke(id: Int): AppearanceInfo
}
