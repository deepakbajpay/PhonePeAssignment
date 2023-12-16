package com.nobroker.myapplication.di.modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({
    "com.nobroker.myapplication.di.modules.NetworkModule.ChatOkkHttpClient",
    "com.nobroker.myapplication.di.modules.NetworkModule.InterceptorHeader"
})
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  private final Provider<Interceptor> headerProvider;

  public NetworkModule_ProvideOkHttpClientFactory(NetworkModule module,
      Provider<Interceptor> headerProvider) {
    this.module = module;
    this.headerProvider = headerProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(module, headerProvider.get());
  }

  public static NetworkModule_ProvideOkHttpClientFactory create(NetworkModule module,
      Provider<Interceptor> headerProvider) {
    return new NetworkModule_ProvideOkHttpClientFactory(module, headerProvider);
  }

  public static OkHttpClient provideOkHttpClient(NetworkModule instance, Interceptor header) {
    return Preconditions.checkNotNullFromProvides(instance.provideOkHttpClient(header));
  }
}
