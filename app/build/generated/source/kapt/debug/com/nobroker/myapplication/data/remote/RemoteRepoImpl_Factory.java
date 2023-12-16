package com.nobroker.myapplication.data.remote;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@QualifierMetadata("com.nobroker.myapplication.di.modules.IoDispatcher")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RemoteRepoImpl_Factory implements Factory<RemoteRepoImpl> {
  private final Provider<NetworkHelper> networkHelperProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public RemoteRepoImpl_Factory(Provider<NetworkHelper> networkHelperProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.networkHelperProvider = networkHelperProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public RemoteRepoImpl get() {
    return newInstance(networkHelperProvider.get(), dispatcherProvider.get());
  }

  public static RemoteRepoImpl_Factory create(Provider<NetworkHelper> networkHelperProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new RemoteRepoImpl_Factory(networkHelperProvider, dispatcherProvider);
  }

  public static RemoteRepoImpl newInstance(NetworkHelper networkHelper,
      CoroutineDispatcher dispatcher) {
    return new RemoteRepoImpl(networkHelper, dispatcher);
  }
}
