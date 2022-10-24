package com.example.superhero.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/superhero/repository/RepositoryImpl;", "Lcom/example/superhero/repository/Repository;", "api", "Lcom/example/superhero/network/SuperHeroService;", "(Lcom/example/superhero/network/SuperHeroService;)V", "access_token", "", "getAppearance", "Lcom/example/superhero/data/entities/AppearanceInfo;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBiography", "Lcom/example/superhero/data/entities/BiographyInfo;", "getConnections", "Lcom/example/superhero/data/entities/ConnectionsInfo;", "getPowerStats", "Lcom/example/superhero/data/entities/PowerStatsInfo;", "getSuperHero", "Lcom/example/superhero/data/entities/SuperHero;", "app_debug"})
public class RepositoryImpl implements com.example.superhero.repository.Repository {
    private final java.lang.String access_token = "3607027246225332";
    private final com.example.superhero.network.SuperHeroService api = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSuperHero(int p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.superhero.data.entities.SuperHero> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPowerStats(int p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.superhero.data.entities.PowerStatsInfo> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getBiography(int p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.superhero.data.entities.BiographyInfo> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAppearance(int p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.superhero.data.entities.AppearanceInfo> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getConnections(int p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.superhero.data.entities.ConnectionsInfo> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public RepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.superhero.network.SuperHeroService api) {
        super();
    }
}