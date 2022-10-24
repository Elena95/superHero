package com.example.superhero.network

import com.example.superhero.data.entities.*
import retrofit2.http.GET
import retrofit2.http.Path

//Peticiones que se ocuparan

interface SuperHeroService {
    @GET("{access_token}/{id}")
    suspend fun superHero(
        @Path("access_token")access_token:Long,
        @Path("id") id: Int
    ): SuperHero

    @GET("{access_token}/{id}/powerstats")
    suspend fun getPowerStats(
        @Path("access_token")access_token:Long,
        @Path("id") id: Int
    ): PowerStatsInfo

    @GET("{access_token}/{id}/biography")
    suspend fun getBiography(
        @Path("access_token")access_token:Long,
        @Path("id") id: Int
    ): BiographyInfo

    @GET("{access_token}/{id}/appearance")
    suspend fun getAppearance(
        @Path("access_token")access_token:Long,
        @Path("id") id: Int
    ): AppearanceInfo

    @GET("{access_token}/{id}/work")
    suspend fun getWork(
        @Path("access_token")access_token:Long,
        @Path("id") id: Int
    ): SuperHero

    @GET("{access_token}/{id}/connections")
    suspend fun getConnections(
        @Path("access_token")access_token:Long,
        @Path("id") id: Int
    ): ConnectionsInfo
}

