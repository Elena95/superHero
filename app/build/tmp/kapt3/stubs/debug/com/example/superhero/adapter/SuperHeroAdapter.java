package com.example.superhero.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/superhero/adapter/SuperHeroAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/superhero/data/entities/SuperHero;", "Lcom/example/superhero/adapter/SuperHeroAdapter$SuperHeroViewHolder;", "onClickListener", "Lcom/example/superhero/adapter/SuperHeroAdapter$OnClickListener;", "(Lcom/example/superhero/adapter/SuperHeroAdapter$OnClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnClickListener", "SUPERHEROCOMPARATOR", "SuperHeroViewHolder", "app_debug"})
public final class SuperHeroAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.superhero.data.entities.SuperHero, com.example.superhero.adapter.SuperHeroAdapter.SuperHeroViewHolder> {
    private final com.example.superhero.adapter.SuperHeroAdapter.OnClickListener onClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.superhero.adapter.SuperHeroAdapter.SuperHeroViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.superhero.adapter.SuperHeroAdapter.SuperHeroViewHolder holder, int position) {
    }
    
    public SuperHeroAdapter(@org.jetbrains.annotations.NotNull()
    com.example.superhero.adapter.SuperHeroAdapter.OnClickListener onClickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/superhero/adapter/SuperHeroAdapter$SUPERHEROCOMPARATOR;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/superhero/data/entities/SuperHero;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class SUPERHEROCOMPARATOR extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.superhero.data.entities.SuperHero> {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.superhero.adapter.SuperHeroAdapter.SUPERHEROCOMPARATOR INSTANCE = null;
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.superhero.data.entities.SuperHero oldItem, @org.jetbrains.annotations.NotNull()
        com.example.superhero.data.entities.SuperHero newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.superhero.data.entities.SuperHero oldItem, @org.jetbrains.annotations.NotNull()
        com.example.superhero.data.entities.SuperHero newItem) {
            return false;
        }
        
        private SUPERHEROCOMPARATOR() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\t0\t0\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/superhero/adapter/SuperHeroAdapter$SuperHeroViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/superhero/databinding/SuperHeroItemBinding;", "(Lcom/example/superhero/databinding/SuperHeroItemBinding;)V", "onBind", "Lcom/bumptech/glide/request/target/ViewTarget;", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "Landroid/graphics/drawable/Drawable;", "superHero", "Lcom/example/superhero/data/entities/SuperHero;", "app_debug"})
    public static final class SuperHeroViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.superhero.databinding.SuperHeroItemBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.bumptech.glide.request.target.ViewTarget<android.widget.ImageView, android.graphics.drawable.Drawable> onBind(@org.jetbrains.annotations.NotNull()
        com.example.superhero.data.entities.SuperHero superHero) {
            return null;
        }
        
        public SuperHeroViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.superhero.databinding.SuperHeroItemBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004R,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/example/superhero/adapter/SuperHeroAdapter$OnClickListener;", "", "clickListener", "Lkotlin/Function1;", "Lcom/example/superhero/data/entities/SuperHero;", "Lkotlin/ParameterName;", "name", "superHero", "", "(Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "onClick", "app_debug"})
    public static final class OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<com.example.superhero.data.entities.SuperHero, kotlin.Unit> clickListener = null;
        
        public final void onClick(@org.jetbrains.annotations.NotNull()
        com.example.superhero.data.entities.SuperHero superHero) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<com.example.superhero.data.entities.SuperHero, kotlin.Unit> getClickListener() {
            return null;
        }
        
        public OnClickListener(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.example.superhero.data.entities.SuperHero, kotlin.Unit> clickListener) {
            super();
        }
    }
}