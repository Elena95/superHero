package com.example.superhero.dil;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0004H\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/example/superhero/dil/SuperHeroesModule;", "", "()V", "getRepository", "Lcom/example/superhero/repository/Repository;", "superheroService", "Lcom/example/superhero/network/SuperHeroService;", "getServicesRX", "getUsesCaseAppearance", "Lcom/example/superhero/data/entities/usecase/GetAppearanceUseCase;", "repository", "getUsesCaseBiography", "Lcom/example/superhero/data/entities/usecase/GetBiographyUseCase;", "getUsesCaseConnections", "Lcom/example/superhero/data/entities/usecase/GetConnectionsUseCase;", "getUsesCaseStats", "Lcom/example/superhero/data/entities/usecase/GetStatsUseCase;", "getUsesCaseSuperhero", "Lcom/example/superhero/data/entities/usecase/GetSuperHeroUseCase;", "app_debug"})
@dagger.Module()
public final class SuperHeroesModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.superhero.dil.SuperHeroesModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.superhero.network.SuperHeroService getServicesRX() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.superhero.repository.Repository getRepository(@org.jetbrains.annotations.NotNull()
    com.example.superhero.network.SuperHeroService superheroService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.superhero.data.entities.usecase.GetSuperHeroUseCase getUsesCaseSuperhero(@org.jetbrains.annotations.NotNull()
    com.example.superhero.repository.Repository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.superhero.data.entities.usecase.GetStatsUseCase getUsesCaseStats(@org.jetbrains.annotations.NotNull()
    com.example.superhero.repository.Repository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.superhero.data.entities.usecase.GetBiographyUseCase getUsesCaseBiography(@org.jetbrains.annotations.NotNull()
    com.example.superhero.repository.Repository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.superhero.data.entities.usecase.GetAppearanceUseCase getUsesCaseAppearance(@org.jetbrains.annotations.NotNull()
    com.example.superhero.repository.Repository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.superhero.data.entities.usecase.GetConnectionsUseCase getUsesCaseConnections(@org.jetbrains.annotations.NotNull()
    com.example.superhero.repository.Repository repository) {
        return null;
    }
    
    private SuperHeroesModule() {
        super();
    }
}