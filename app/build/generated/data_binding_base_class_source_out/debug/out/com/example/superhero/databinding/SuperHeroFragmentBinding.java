// Generated by data binding compiler. Do not edit!
package com.example.superhero.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.superhero.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SuperHeroFragmentBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView mRecyclerView;

  protected SuperHeroFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView mRecyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.mRecyclerView = mRecyclerView;
  }

  @NonNull
  public static SuperHeroFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.super_hero_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SuperHeroFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SuperHeroFragmentBinding>inflateInternal(inflater, R.layout.super_hero_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static SuperHeroFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.super_hero_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SuperHeroFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SuperHeroFragmentBinding>inflateInternal(inflater, R.layout.super_hero_fragment, null, false, component);
  }

  public static SuperHeroFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static SuperHeroFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (SuperHeroFragmentBinding)bind(component, view, R.layout.super_hero_fragment);
  }
}
