package com.nobroker.myapplication.di.modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.Interceptor;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.nobroker.myapplication.di.modules.NetworkModule.InterceptorHeader")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideHeadersFactory implements Factory<Interceptor> {
  private final NetworkModule module;

  public NetworkModule_ProvideHeadersFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public Interceptor get() {
    return provideHeaders(module);
  }

  public static NetworkModule_ProvideHeadersFactory create(NetworkModule module) {
    return new NetworkModule_ProvideHeadersFactory(module);
  }

  public static Interceptor provideHeaders(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideHeaders());
  }
}
