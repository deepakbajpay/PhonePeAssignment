package com.nobroker.myapplication.di.modules;

import android.content.Context;
import androidx.room.Room;
import com.nobroker.myapplication.data.local.AppDatabase;
import com.nobroker.myapplication.utils.Constants;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Named;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/nobroker/myapplication/di/modules/DatabaseModule;", "", "()V", "provideAppDatabase", "Lcom/nobroker/myapplication/data/local/AppDatabase;", "dbName", "", "context", "Landroid/content/Context;", "provideDbName", "app_debug"})
@dagger.Module
public final class DatabaseModule {
    
    public DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "chat_db")
    @javax.inject.Singleton
    @dagger.Provides
    public final java.lang.String provideDbName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.nobroker.myapplication.data.local.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "chat_db")
    java.lang.String dbName, @org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
}