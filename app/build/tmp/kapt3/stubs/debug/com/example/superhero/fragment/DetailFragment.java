package com.example.superhero.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0014\u001a\u001e\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u0016\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00180\u00180\u00152\u0006\u0010\u0010\u001a\u00020\u0005J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006$"}, d2 = {"Lcom/example/superhero/fragment/DetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_resultSuperHero", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/superhero/data/entities/SuperHero;", "args", "Lcom/example/superhero/fragment/DetailFragmentArgs;", "getArgs", "()Lcom/example/superhero/fragment/DetailFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/example/superhero/databinding/DetailFragmentBinding;", "navController", "Landroidx/navigation/NavController;", "superHero", "Landroidx/lifecycle/LiveData;", "getSuperHero", "()Landroidx/lifecycle/LiveData;", "infoHero", "Lcom/bumptech/glide/request/target/ViewTarget;", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "Landroid/graphics/drawable/Drawable;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DetailFragment extends androidx.fragment.app.Fragment {
    private com.example.superhero.databinding.DetailFragmentBinding binding;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private androidx.navigation.NavController navController;
    private androidx.lifecycle.MutableLiveData<com.example.superhero.data.entities.SuperHero> _resultSuperHero;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.superhero.data.entities.SuperHero> superHero = null;
    
    private final com.example.superhero.fragment.DetailFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.superhero.data.entities.SuperHero> getSuperHero() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bumptech.glide.request.target.ViewTarget<android.widget.ImageView, android.graphics.drawable.Drawable> infoHero(@org.jetbrains.annotations.NotNull()
    com.example.superhero.data.entities.SuperHero superHero) {
        return null;
    }
    
    public DetailFragment() {
        super();
    }
}