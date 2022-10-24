package com.example.superhero.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006$"}, d2 = {"Lcom/example/superhero/viewmodel/SuperHeroesViewModel;", "Landroidx/lifecycle/ViewModel;", "getSuperHeroUseCase", "Lcom/example/superhero/data/entities/usecase/GetSuperHeroUseCase;", "(Lcom/example/superhero/data/entities/usecase/GetSuperHeroUseCase;)V", "_resultData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/superhero/data/entities/SuperHero;", "getGetSuperHeroUseCase", "()Lcom/example/superhero/data/entities/usecase/GetSuperHeroUseCase;", "init", "", "getInit", "()I", "setInit", "(I)V", "limit", "getLimit", "setLimit", "listSuperHero", "", "loadPage", "", "getLoadPage", "()Landroidx/lifecycle/MutableLiveData;", "result", "Landroidx/lifecycle/LiveData;", "getResult", "()Landroidx/lifecycle/LiveData;", "getSuperHero", "", "nextPage", "onFailureGetHeroes", "it", "", "app_debug"})
public final class SuperHeroesViewModel extends androidx.lifecycle.ViewModel {
    private int init = 1;
    private int limit = 5;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.superhero.data.entities.SuperHero>> _resultData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.superhero.data.entities.SuperHero>> result = null;
    private java.util.List<com.example.superhero.data.entities.SuperHero> listSuperHero;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadPage = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.superhero.data.entities.usecase.GetSuperHeroUseCase getSuperHeroUseCase = null;
    
    public final int getInit() {
        return 0;
    }
    
    public final void setInit(int p0) {
    }
    
    public final int getLimit() {
        return 0;
    }
    
    public final void setLimit(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.superhero.data.entities.SuperHero>> getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadPage() {
        return null;
    }
    
    public final void getSuperHero() {
    }
    
    public final void onFailureGetHeroes(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable it) {
    }
    
    public final void nextPage() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.superhero.data.entities.usecase.GetSuperHeroUseCase getGetSuperHeroUseCase() {
        return null;
    }
    
    @javax.inject.Inject()
    public SuperHeroesViewModel(@org.jetbrains.annotations.NotNull()
    com.example.superhero.data.entities.usecase.GetSuperHeroUseCase getSuperHeroUseCase) {
        super();
    }
}