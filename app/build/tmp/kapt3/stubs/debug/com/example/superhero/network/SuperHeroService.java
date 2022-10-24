package com.example.superhero.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/superhero/network/SuperHeroService;", "", "getAppearance", "Lcom/example/superhero/data/entities/AppearanceInfo;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBiography", "Lcom/example/superhero/data/entities/BiographyInfo;", "getConnections", "Lcom/example/superhero/data/entities/ConnectionsInfo;", "getPowerStats", "Lcom/example/superhero/data/entities/PowerStatsInfo;", "getWork", "Lcom/example/superhero/data/entities/SuperHero;", "superHero", "app_debug"})
public abstract interface SuperHeroService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "3607027246225332/{id}")
    public abstract java.lang.Object superHero(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.superhero.data.entities.SuperHero> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "3607027246225332/{id}/powerstats")
    public abstract java.lang.Object getPowerStats(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.superhero.data.entities.PowerStatsInfo> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "3607027246225332/{id}/biography")
    public abstract java.lang.Object getBiography(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.superhero.data.entities.BiographyInfo> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "3607027246225332/{id}/appearance")
    public abstract java.lang.Object getAppearance(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.superhero.data.entities.AppearanceInfo> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "3607027246225332/{id}/work")
    public abstract java.lang.Object getWork(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.superhero.data.entities.SuperHero> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "3607027246225332/{id}/connections")
    public abstract java.lang.Object getConnections(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.superhero.data.entities.ConnectionsInfo> p1);
}