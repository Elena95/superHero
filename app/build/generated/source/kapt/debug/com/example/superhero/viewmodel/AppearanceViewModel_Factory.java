// Generated by Dagger (https://dagger.dev).
package com.example.superhero.viewmodel;

import com.example.superhero.data.entities.usecase.GetAppearanceUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppearanceViewModel_Factory implements Factory<AppearanceViewModel> {
  private final Provider<GetAppearanceUseCase> getUsesCaseAppearanceProvider;

  public AppearanceViewModel_Factory(Provider<GetAppearanceUseCase> getUsesCaseAppearanceProvider) {
    this.getUsesCaseAppearanceProvider = getUsesCaseAppearanceProvider;
  }

  @Override
  public AppearanceViewModel get() {
    return newInstance(getUsesCaseAppearanceProvider.get());
  }

  public static AppearanceViewModel_Factory create(
      Provider<GetAppearanceUseCase> getUsesCaseAppearanceProvider) {
    return new AppearanceViewModel_Factory(getUsesCaseAppearanceProvider);
  }

  public static AppearanceViewModel newInstance(GetAppearanceUseCase getUsesCaseAppearance) {
    return new AppearanceViewModel(getUsesCaseAppearance);
  }
}