package com.example.superhero.network

import com.example.superhero.data.entities.*
import retrofit2.http.GET
import retrofit2.http.Path

//Peticiones que se ocuparan

interface SuperHeroService {
    @GET("3607027246225332/{id}")
    suspend fun superHero(
        @Path("id") id: Int,
        //@Path("access-token")access_token:String
    ): SuperHero

    @GET("3607027246225332/{id}/powerstats")
    suspend fun getPowerStats(
        @Path("id") id: Int,
        // @Path("access-token")access_token:String
    ): PowerStatsInfo

    @GET("3607027246225332/{id}/biography")
    suspend fun getBiography(
        @Path("id") id: Int,
        // @Path("access-token")access_token:String
    ): BiographyInfo

    @GET("3607027246225332/{id}/appearance")
    suspend fun getAppearance(
        @Path("id") id: Int,
        // @Path("access-token")access_token:String
    ): AppearanceInfo

    @GET("3607027246225332/{id}/work")
    suspend fun getWork(
        @Path("id") id: Int,
        // @Path("access-token")access_token:String
    ): SuperHero

    @GET("3607027246225332/{id}/connections")
    suspend fun getConnections(
        @Path("id") id: Int,
        // @Path("access-token")access_token:String
    ): ConnectionsInfo
}

