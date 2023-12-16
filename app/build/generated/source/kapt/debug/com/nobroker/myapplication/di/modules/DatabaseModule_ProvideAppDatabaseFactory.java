package com.nobroker.myapplication.di.modules;

import android.content.Context;
import com.nobroker.myapplication.data.local.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({
    "javax.inject.Named",
    "dagger.hilt.android.qualifiers.ApplicationContext"
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
public final class DatabaseModule_ProvideAppDatabaseFactory implements Factory<AppDatabase> {
  private final DatabaseModule module;

  private final Provider<String> dbNameProvider;

  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvideAppDatabaseFactory(DatabaseModule module,
      Provider<String> dbNameProvider, Provider<Context> contextProvider) {
    this.module = module;
    this.dbNameProvider = dbNameProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAppDatabase(module, dbNameProvider.get(), contextProvider.get());
  }

  public static DatabaseModule_ProvideAppDatabaseFactory create(DatabaseModule module,
      Provider<String> dbNameProvider, Provider<Context> contextProvider) {
    return new DatabaseModule_ProvideAppDatabaseFactory(module, dbNameProvider, contextProvider);
  }

  public static AppDatabase provideAppDatabase(DatabaseModule instance, String dbName,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideAppDatabase(dbName, context));
  }
}
