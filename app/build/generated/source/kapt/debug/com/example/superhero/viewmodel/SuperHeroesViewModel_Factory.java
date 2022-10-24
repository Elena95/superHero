// Generated by Dagger (https://dagger.dev).
package com.example.superhero.viewmodel;

import com.example.superhero.data.entities.usecase.GetSuperHeroUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SuperHeroesViewModel_Factory implements Factory<SuperHeroesViewModel> {
  private final Provider<GetSuperHeroUseCase> getSuperHeroUseCaseProvider;

  public SuperHeroesViewModel_Factory(Provider<GetSuperHeroUseCase> getSuperHeroUseCaseProvider) {
    this.getSuperHeroUseCaseProvider = getSuperHeroUseCaseProvider;
  }

  @Override
  public SuperHeroesViewModel get() {
    return newInstance(getSuperHeroUseCaseProvider.get());
  }

  public static SuperHeroesViewModel_Factory create(
      Provider<GetSuperHeroUseCase> getSuperHeroUseCaseProvider) {
    return new SuperHeroesViewModel_Factory(getSuperHeroUseCaseProvider);
  }

  public static SuperHeroesViewModel newInstance(GetSuperHeroUseCase getSuperHeroUseCase) {
    return new SuperHeroesViewModel(getSuperHeroUseCase);
  }
}
