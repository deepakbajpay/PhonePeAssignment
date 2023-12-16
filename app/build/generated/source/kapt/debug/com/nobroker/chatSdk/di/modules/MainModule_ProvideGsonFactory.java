package com.nobroker.chatSdk.di.modules;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class MainModule_ProvideGsonFactory implements Factory<Gson> {
  private final MainModule module;

  public MainModule_ProvideGsonFactory(MainModule module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return provideGson(module);
  }

  public static MainModule_ProvideGsonFactory create(MainModule module) {
    return new MainModule_ProvideGsonFactory(module);
  }

  public static Gson provideGson(MainModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideGson());
  }
}
