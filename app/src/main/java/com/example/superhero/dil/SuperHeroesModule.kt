package com.example.superhero.dil

import com.example.superhero.*
import com.example.superhero.data.entities.usecase.*
import com.example.superhero.network.NetworkClient
import com.example.superhero.network.SuperHeroService
import com.example.superhero.repository.Repository
import com.example.superhero.repository.RepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

// Modulo para informar a Hilt la injeccion de dependencias entre clases
@Module
@InstallIn(SingletonComponent::class)
object SuperHeroesModule {

    @Provides
    fun getServicesRX(): SuperHeroService {
        return NetworkClient().getSuperHero()
    }

    @Provides
    fun getRepository(superheroService: SuperHeroService): Repository {
        return RepositoryImpl(superheroService)
    }

    @Provides
    fun getUsesCaseSuperhero(repository: Repository): GetSuperHeroUseCase {
        return GetSuperHeroUseCaseImp(repository)
    }

    @Provides
    fun getUsesCaseStats(repository: Repository): GetStatsUseCase {
        return GetStatsUseCaseImp(repository)
    }

    @Provides
    fun getUsesCaseBiography(repository: Repository): GetBiographyUseCase {
        return GetBiographyUseCaseImp(repository)
    }

    @Provides
    fun getUsesCaseAppearance(repository: Repository): GetAppearanceUseCase {
        return GetAppearanceUseCaseImp(repository)
    }

    @Provides
    fun getUsesCaseConnections(repository: Repository): GetConnectionsUseCase {
        return GetConnectionsUseCaseImp(repository)
    }
}



