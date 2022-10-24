package com.example.superhero.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/example/superhero/viewmodel/AppearanceViewModel;", "Landroidx/lifecycle/ViewModel;", "getUsesCaseAppearance", "Lcom/example/superhero/data/entities/usecase/GetAppearanceUseCase;", "(Lcom/example/superhero/data/entities/usecase/GetAppearanceUseCase;)V", "appearance", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/superhero/data/entities/AppearanceInfo;", "getGetUsesCaseAppearance", "()Lcom/example/superhero/data/entities/usecase/GetAppearanceUseCase;", "result", "Landroidx/lifecycle/LiveData;", "getResult", "()Landroidx/lifecycle/LiveData;", "getAppearance", "", "id", "", "app_debug"})
public final class AppearanceViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.superhero.data.entities.AppearanceInfo> appearance = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.superhero.data.entities.usecase.GetAppearanceUseCase getUsesCaseAppearance = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.superhero.data.entities.AppearanceInfo> getResult() {
        return null;
    }
    
    public final void getAppearance(int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.superhero.data.entities.usecase.GetAppearanceUseCase getGetUsesCaseAppearance() {
        return null;
    }
    
    @javax.inject.Inject()
    public AppearanceViewModel(@org.jetbrains.annotations.NotNull()
    com.example.superhero.data.entities.usecase.GetAppearanceUseCase getUsesCaseAppearance) {
        super();
    }
}