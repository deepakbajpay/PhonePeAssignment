package com.nobroker.myapplication.ui.venues;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class VenueViewModel_Factory implements Factory<VenueViewModel> {
  private final Provider<VenueRepositoryImpl> repositoryProvider;

  public VenueViewModel_Factory(Provider<VenueRepositoryImpl> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public VenueViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static VenueViewModel_Factory create(Provider<VenueRepositoryImpl> repositoryProvider) {
    return new VenueViewModel_Factory(repositoryProvider);
  }

  public static VenueViewModel newInstance(VenueRepositoryImpl repository) {
    return new VenueViewModel(repository);
  }
}
