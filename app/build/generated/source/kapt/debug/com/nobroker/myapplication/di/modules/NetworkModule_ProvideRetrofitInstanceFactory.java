package com.nobroker.myapplication.di.modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({
    "com.nobroker.myapplication.di.modules.NetworkModule.ChatRetrofit",
    "com.nobroker.myapplication.di.modules.NetworkModule.ChatOkkHttpClient"
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
public final class NetworkModule_ProvideRetrofitInstanceFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetworkModule_ProvideRetrofitInstanceFactory(NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofitInstance(module, okHttpClientProvider.get());
  }

  public static NetworkModule_ProvideRetrofitInstanceFactory create(NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new NetworkModule_ProvideRetrofitInstanceFactory(module, okHttpClientProvider);
  }

  public static Retrofit provideRetrofitInstance(NetworkModule instance,
      OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(instance.provideRetrofitInstance(okHttpClient));
  }
}
