// Generated by data binding compiler. Do not edit!
package com.example.superhero.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.superhero.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AppearanceFragmentBinding extends ViewDataBinding {
  @NonNull
  public final CardView carView;

  @NonNull
  public final TextView tvEyeColor;

  @NonNull
  public final TextView tvGender;

  @NonNull
  public final TextView tvHairColor;

  @NonNull
  public final TextView tvHeight;

  @NonNull
  public final TextView tvItemEyeColor;

  @NonNull
  public final TextView tvItemGender;

  @NonNull
  public final TextView tvItemHairColor;

  @NonNull
  public final TextView tvItemHeight;

  @NonNull
  public final TextView tvItemRace;

  @NonNull
  public final TextView tvItemWeight;

  @NonNull
  public final TextView tvRace;

  @NonNull
  public final TextView tvWeight;

  protected AppearanceFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView carView, TextView tvEyeColor, TextView tvGender, TextView tvHairColor,
      TextView tvHeight, TextView tvItemEyeColor, TextView tvItemGender, TextView tvItemHairColor,
      TextView tvItemHeight, TextView tvItemRace, TextView tvItemWeight, TextView tvRace,
      TextView tvWeight) {
    super(_bindingComponent, _root, _localFieldCount);
    this.carView = carView;
    this.tvEyeColor = tvEyeColor;
    this.tvGender = tvGender;
    this.tvHairColor = tvHairColor;
    this.tvHeight = tvHeight;
    this.tvItemEyeColor = tvItemEyeColor;
    this.tvItemGender = tvItemGender;
    this.tvItemHairColor = tvItemHairColor;
    this.tvItemHeight = tvItemHeight;
    this.tvItemRace = tvItemRace;
    this.tvItemWeight = tvItemWeight;
    this.tvRace = tvRace;
    this.tvWeight = tvWeight;
  }

  @NonNull
  public static AppearanceFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.appearance_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AppearanceFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AppearanceFragmentBinding>inflateInternal(inflater, R.layout.appearance_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static AppearanceFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.appearance_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AppearanceFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AppearanceFragmentBinding>inflateInternal(inflater, R.layout.appearance_fragment, null, false, component);
  }

  public static AppearanceFragmentBinding bind(@NonNull View view) {
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
  public static AppearanceFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (AppearanceFragmentBinding)bind(component, view, R.layout.appearance_fragment);
  }
}
