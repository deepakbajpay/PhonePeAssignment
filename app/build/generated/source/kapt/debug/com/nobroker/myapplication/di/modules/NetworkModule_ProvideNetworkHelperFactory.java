package com.nobroker.myapplication.di.modules;

import com.nobroker.myapplication.data.remote.NetworkHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.nobroker.myapplication.di.modules.NetworkModule.ChatRetrofit")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideNetworkHelperFactory implements Factory<NetworkHelper> {
  private final NetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideNetworkHelperFactory(NetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public NetworkHelper get() {
    return provideNetworkHelper(module, retrofitProvider.get());
  }

  public static NetworkModule_ProvideNetworkHelperFactory create(NetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideNetworkHelperFactory(module, retrofitProvider);
  }

  public static NetworkHelper provideNetworkHelper(NetworkModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.provideNetworkHelper(retrofit));
  }
}
