package com.nobroker.myapplication.di.modules;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import java.lang.annotation.ElementType;
import javax.inject.Qualifier;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lcom/nobroker/myapplication/di/modules/CoroutinesModule;", "", "()V", "providesDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "providesIODispatcher", "app_debug"})
@dagger.Module
public final class CoroutinesModule {
    @org.jetbrains.annotations.NotNull
    public static final com.nobroker.myapplication.di.modules.CoroutinesModule INSTANCE = null;
    
    private CoroutinesModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @IoDispatcher
    @dagger.Provides
    public final kotlinx.coroutines.CoroutineDispatcher providesIODispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @DefaultDispatcher
    @dagger.Provides
    public final kotlinx.coroutines.CoroutineDispatcher providesDefaultDispatcher() {
        return null;
    }
}