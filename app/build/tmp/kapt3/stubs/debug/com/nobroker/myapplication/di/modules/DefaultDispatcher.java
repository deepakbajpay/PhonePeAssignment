package com.nobroker.myapplication.di.modules;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import java.lang.annotation.ElementType;
import javax.inject.Qualifier;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/nobroker/myapplication/di/modules/DefaultDispatcher;", "", "app_debug"})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@javax.inject.Qualifier
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
public abstract @interface DefaultDispatcher {
}