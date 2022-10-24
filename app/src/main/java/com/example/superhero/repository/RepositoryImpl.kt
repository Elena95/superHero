package com.example.superhero.repository

import com.example.superhero.data.entities.*
import com.example.superhero.network.SuperHeroService
import javax.inject.Inject

open class RepositoryImpl @Inject constructor(private val api: SuperHeroService) : Repository {
    private val access_token = com.example.superhero.BuildConfig.ACCESS_TOKEN

    override suspend fun getSuperHero(id: Int): SuperHero {
        return api.superHero(access_token,id)
    }

    override suspend fun getPowerStats(id: Int): PowerStatsInfo {
        return api.getPowerStats(access_token,id)
    }

    override suspend fun getBiography(id: Int): BiographyInfo {
        return api.getBiography(access_token,id)
    }

    override suspend fun getAppearance(id: Int): AppearanceInfo {
        return api.getAppearance(access_token,id)
    }

    override suspend fun getConnections(id: Int): ConnectionsInfo {
        return api.getConnections(access_token,id)
    }

}