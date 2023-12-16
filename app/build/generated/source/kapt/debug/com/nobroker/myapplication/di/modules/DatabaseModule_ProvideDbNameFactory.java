package com.nobroker.myapplication.di.modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("javax.inject.Named")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideDbNameFactory implements Factory<String> {
  private final DatabaseModule module;

  public DatabaseModule_ProvideDbNameFactory(DatabaseModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideDbName(module);
  }

  public static DatabaseModule_ProvideDbNameFactory create(DatabaseModule module) {
    return new DatabaseModule_ProvideDbNameFactory(module);
  }

  public static String provideDbName(DatabaseModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideDbName());
  }
}
