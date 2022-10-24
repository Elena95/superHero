package com.example.superhero;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.superhero.databinding.ActivityMainBindingImpl;
import com.example.superhero.databinding.AppearanceFragmentBindingImpl;
import com.example.superhero.databinding.BiographyFragmentBindingImpl;
import com.example.superhero.databinding.ConnectionsFragmentBindingImpl;
import com.example.superhero.databinding.DetailFragmentBindingImpl;
import com.example.superhero.databinding.PowerstatsFragmentBindingImpl;
import com.example.superhero.databinding.SuperHeroFragmentBindingImpl;
import com.example.superhero.databinding.SuperHeroItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_APPEARANCEFRAGMENT = 2;

  private static final int LAYOUT_BIOGRAPHYFRAGMENT = 3;

  private static final int LAYOUT_CONNECTIONSFRAGMENT = 4;

  private static final int LAYOUT_DETAILFRAGMENT = 5;

  private static final int LAYOUT_POWERSTATSFRAGMENT = 6;

  private static final int LAYOUT_SUPERHEROFRAGMENT = 7;

  private static final int LAYOUT_SUPERHEROITEM = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.superhero.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.superhero.R.layout.appearance_fragment, LAYOUT_APPEARANCEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.superhero.R.layout.biography_fragment, LAYOUT_BIOGRAPHYFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.superhero.R.layout.connections_fragment, LAYOUT_CONNECTIONSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.superhero.R.layout.detail_fragment, LAYOUT_DETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.superhero.R.layout.powerstats_fragment, LAYOUT_POWERSTATSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.superhero.R.layout.super_hero_fragment, LAYOUT_SUPERHEROFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.superhero.R.layout.super_hero_item, LAYOUT_SUPERHEROITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_APPEARANCEFRAGMENT: {
          if ("layout/appearance_fragment_0".equals(tag)) {
            return new AppearanceFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for appearance_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_BIOGRAPHYFRAGMENT: {
          if ("layout/biography_fragment_0".equals(tag)) {
            return new BiographyFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for biography_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_CONNECTIONSFRAGMENT: {
          if ("layout/connections_fragment_0".equals(tag)) {
            return new ConnectionsFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for connections_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_DETAILFRAGMENT: {
          if ("layout/detail_fragment_0".equals(tag)) {
            return new DetailFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for detail_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_POWERSTATSFRAGMENT: {
          if ("layout/powerstats_fragment_0".equals(tag)) {
            return new PowerstatsFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for powerstats_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_SUPERHEROFRAGMENT: {
          if ("layout/super_hero_fragment_0".equals(tag)) {
            return new SuperHeroFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for super_hero_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_SUPERHEROITEM: {
          if ("layout/super_hero_item_0".equals(tag)) {
            return new SuperHeroItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for super_hero_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_main_0", com.example.superhero.R.layout.activity_main);
      sKeys.put("layout/appearance_fragment_0", com.example.superhero.R.layout.appearance_fragment);
      sKeys.put("layout/biography_fragment_0", com.example.superhero.R.layout.biography_fragment);
      sKeys.put("layout/connections_fragment_0", com.example.superhero.R.layout.connections_fragment);
      sKeys.put("layout/detail_fragment_0", com.example.superhero.R.layout.detail_fragment);
      sKeys.put("layout/powerstats_fragment_0", com.example.superhero.R.layout.powerstats_fragment);
      sKeys.put("layout/super_hero_fragment_0", com.example.superhero.R.layout.super_hero_fragment);
      sKeys.put("layout/super_hero_item_0", com.example.superhero.R.layout.super_hero_item);
    }
  }
}
