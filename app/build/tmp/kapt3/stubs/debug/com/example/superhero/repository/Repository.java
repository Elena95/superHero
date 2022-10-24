package com.example.superhero.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/superhero/repository/Repository;", "", "getAppearance", "Lcom/example/superhero/data/entities/AppearanceInfo;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBiography", "Lcom/example/superhero/data/entities/BiographyInfo;", "getConnections", "Lcom/example/superhero/data/entities/ConnectionsInfo;", "getPowerStats", "Lcom/example/superhero/data/entities/PowerStatsInfo;", "getSuperHero", "Lcom/example/superhero/data/entities/SuperHero;", "app_debug"})
public abstract interface Repository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSuperHero(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.superhero.data.entities.SuperHero> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPowerStats(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.superhero.data.entities.PowerStatsInfo> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBiography(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.superhero.data.entities.BiographyInfo> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAppearance(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.superhero.data.entities.AppearanceInfo> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getConnections(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.superhero.data.entities.ConnectionsInfo> p1);
}