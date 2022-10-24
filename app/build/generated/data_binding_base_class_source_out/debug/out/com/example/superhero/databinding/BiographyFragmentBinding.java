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

public abstract class BiographyFragmentBinding extends ViewDataBinding {
  @NonNull
  public final CardView carView;

  @NonNull
  public final TextView tvAliases;

  @NonNull
  public final TextView tvAppearence;

  @NonNull
  public final TextView tvBirth;

  @NonNull
  public final TextView tvEgos;

  @NonNull
  public final TextView tvFullName;

  @NonNull
  public final TextView tvItemAliases;

  @NonNull
  public final TextView tvItemAppearence;

  @NonNull
  public final TextView tvItemBirth;

  @NonNull
  public final TextView tvItemEgos;

  @NonNull
  public final TextView tvItemFullName;

  @NonNull
  public final TextView tvItemPublisher;

  @NonNull
  public final TextView tvPublisher;

  protected BiographyFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView carView, TextView tvAliases, TextView tvAppearence, TextView tvBirth,
      TextView tvEgos, TextView tvFullName, TextView tvItemAliases, TextView tvItemAppearence,
      TextView tvItemBirth, TextView tvItemEgos, TextView tvItemFullName, TextView tvItemPublisher,
      TextView tvPublisher) {
    super(_bindingComponent, _root, _localFieldCount);
    this.carView = carView;
    this.tvAliases = tvAliases;
    this.tvAppearence = tvAppearence;
    this.tvBirth = tvBirth;
    this.tvEgos = tvEgos;
    this.tvFullName = tvFullName;
    this.tvItemAliases = tvItemAliases;
    this.tvItemAppearence = tvItemAppearence;
    this.tvItemBirth = tvItemBirth;
    this.tvItemEgos = tvItemEgos;
    this.tvItemFullName = tvItemFullName;
    this.tvItemPublisher = tvItemPublisher;
    this.tvPublisher = tvPublisher;
  }

  @NonNull
  public static BiographyFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.biography_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BiographyFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BiographyFragmentBinding>inflateInternal(inflater, R.layout.biography_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static BiographyFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.biography_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BiographyFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BiographyFragmentBinding>inflateInternal(inflater, R.layout.biography_fragment, null, false, component);
  }

  public static BiographyFragmentBinding bind(@NonNull View view) {
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
  public static BiographyFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (BiographyFragmentBinding)bind(component, view, R.layout.biography_fragment);
  }
}