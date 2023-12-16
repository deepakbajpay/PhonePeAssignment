package com.nobroker.myapplication.ui.venues;

import android.content.Context;
import com.nobroker.myapplication.data.remote.RemoteRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class VenueRepositoryImpl_Factory implements Factory<VenueRepositoryImpl> {
  private final Provider<RemoteRepo> remoteRepoProvider;

  private final Provider<Context> applicationContextProvider;

  public VenueRepositoryImpl_Factory(Provider<RemoteRepo> remoteRepoProvider,
      Provider<Context> applicationContextProvider) {
    this.remoteRepoProvider = remoteRepoProvider;
    this.applicationContextProvider = applicationContextProvider;
  }

  @Override
  public VenueRepositoryImpl get() {
    return newInstance(remoteRepoProvider.get(), applicationContextProvider.get());
  }

  public static VenueRepositoryImpl_Factory create(Provider<RemoteRepo> remoteRepoProvider,
      Provider<Context> applicationContextProvider) {
    return new VenueRepositoryImpl_Factory(remoteRepoProvider, applicationContextProvider);
  }

  public static VenueRepositoryImpl newInstance(RemoteRepo remoteRepo, Context applicationContext) {
    return new VenueRepositoryImpl(remoteRepo, applicationContext);
  }
}
