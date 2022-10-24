package com.example.superhero.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//Construyendo peticion base con Retrofit
class NetworkClient {
    private val api = Retrofit.Builder()
        .baseUrl(com.example.superhero.BuildConfig.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())

    fun getSuperHero(): SuperHeroService {
        return api
            .build()
            .create(SuperHeroService::class.java)
    }
}