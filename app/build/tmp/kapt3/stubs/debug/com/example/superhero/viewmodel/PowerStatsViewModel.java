package com.example.superhero.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/example/superhero/viewmodel/PowerStatsViewModel;", "Landroidx/lifecycle/ViewModel;", "getStatsUseCase", "Lcom/example/superhero/data/entities/usecase/GetStatsUseCase;", "(Lcom/example/superhero/data/entities/usecase/GetStatsUseCase;)V", "getGetStatsUseCase", "()Lcom/example/superhero/data/entities/usecase/GetStatsUseCase;", "powerstats", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/superhero/data/entities/PowerStatsInfo;", "result", "Landroidx/lifecycle/LiveData;", "getResult", "()Landroidx/lifecycle/LiveData;", "getPowerStats", "", "id", "", "app_debug"})
public final class PowerStatsViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.superhero.data.entities.PowerStatsInfo> powerstats = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.superhero.data.entities.usecase.GetStatsUseCase getStatsUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.superhero.data.entities.PowerStatsInfo> getResult() {
        return null;
    }
    
    public final void getPowerStats(int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.superhero.data.entities.usecase.GetStatsUseCase getGetStatsUseCase() {
        return null;
    }
    
    @javax.inject.Inject()
    public PowerStatsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.superhero.data.entities.usecase.GetStatsUseCase getStatsUseCase) {
        super();
    }
}