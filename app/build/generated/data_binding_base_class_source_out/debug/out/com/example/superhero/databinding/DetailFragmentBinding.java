// Generated by data binding compiler. Do not edit!
package com.example.superhero.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.example.superhero.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DetailFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout detailScreenFragment;

  @NonNull
  public final ImageView imageHeroe;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final TextView tvBaseText;

  @NonNull
  public final TextView tvBaseTitle;

  @NonNull
  public final TextView tvOcupation;

  @NonNull
  public final TextView tvOcupationText;

  @NonNull
  public final TextView tvWork;

  @NonNull
  public final ViewPager2 viewPager;

  protected DetailFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout detailScreenFragment, ImageView imageHeroe, TabLayout tabLayout,
      TextView tvBaseText, TextView tvBaseTitle, TextView tvOcupation, TextView tvOcupationText,
      TextView tvWork, ViewPager2 viewPager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.detailScreenFragment = detailScreenFragment;
    this.imageHeroe = imageHeroe;
    this.tabLayout = tabLayout;
    this.tvBaseText = tvBaseText;
    this.tvBaseTitle = tvBaseTitle;
    this.tvOcupation = tvOcupation;
    this.tvOcupationText = tvOcupationText;
    this.tvWork = tvWork;
    this.viewPager = viewPager;
  }

  @NonNull
  public static DetailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.detail_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DetailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DetailFragmentBinding>inflateInternal(inflater, R.layout.detail_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static DetailFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.detail_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DetailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DetailFragmentBinding>inflateInternal(inflater, R.layout.detail_fragment, null, false, component);
  }

  public static DetailFragmentBinding bind(@NonNull View view) {
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
  public static DetailFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (DetailFragmentBinding)bind(component, view, R.layout.detail_fragment);
  }
}
