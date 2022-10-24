package com.example.superhero.repository

import com.example.superhero.data.entities.*

//Interfaz Repo de peticiones
interface Repository {
    suspend fun getSuperHero(id: Int): SuperHero
    suspend fun getPowerStats(id: Int): PowerStatsInfo
    suspend fun getBiography(id: Int): BiographyInfo
    suspend fun getAppearance(id: Int): AppearanceInfo
    suspend fun getConnections(id: Int): ConnectionsInfo
}