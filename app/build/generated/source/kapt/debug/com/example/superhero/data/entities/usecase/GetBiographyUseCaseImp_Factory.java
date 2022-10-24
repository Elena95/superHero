// Generated by Dagger (https://dagger.dev).
package com.example.superhero.data.entities.usecase;

import com.example.superhero.repository.Repository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetBiographyUseCaseImp_Factory implements Factory<GetBiographyUseCaseImp> {
  private final Provider<Repository> repositoryProvider;

  public GetBiographyUseCaseImp_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetBiographyUseCaseImp get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetBiographyUseCaseImp_Factory create(Provider<Repository> repositoryProvider) {
    return new GetBiographyUseCaseImp_Factory(repositoryProvider);
  }

  public static GetBiographyUseCaseImp newInstance(Repository repository) {
    return new GetBiographyUseCaseImp(repository);
  }
}
