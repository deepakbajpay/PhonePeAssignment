package com.nobroker.myapplication.di.modules;

import com.nobroker.myapplication.data.remote.NetworkHelper;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Qualifier;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0004H\u0007J\u0012\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\nH\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/nobroker/myapplication/di/modules/NetworkModule;", "", "()V", "provideHeaders", "Lokhttp3/Interceptor;", "provideNetworkHelper", "Lcom/nobroker/myapplication/data/remote/NetworkHelper;", "retrofit", "Lretrofit2/Retrofit;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "header", "provideRetrofitInstance", "okHttpClient", "ChatOkkHttpClient", "ChatRetrofit", "InterceptorHeader", "app_debug"})
@dagger.Module
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @com.nobroker.myapplication.di.modules.NetworkModule.ChatRetrofit
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.Retrofit provideRetrofitInstance(@org.jetbrains.annotations.NotNull
    @com.nobroker.myapplication.di.modules.NetworkModule.ChatOkkHttpClient
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @com.nobroker.myapplication.di.modules.NetworkModule.ChatOkkHttpClient
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull
    @com.nobroker.myapplication.di.modules.NetworkModule.InterceptorHeader
    okhttp3.Interceptor header) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @com.nobroker.myapplication.di.modules.NetworkModule.InterceptorHeader
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.Interceptor provideHeaders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.nobroker.myapplication.data.remote.NetworkHelper provideNetworkHelper(@org.jetbrains.annotations.NotNull
    @com.nobroker.myapplication.di.modules.NetworkModule.ChatRetrofit
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/nobroker/myapplication/di/modules/NetworkModule$InterceptorHeader;", "", "app_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.BINARY)
    @javax.inject.Qualifier
    public static abstract @interface InterceptorHeader {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/nobroker/myapplication/di/modules/NetworkModule$ChatRetrofit;", "", "app_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.BINARY)
    @javax.inject.Qualifier
    public static abstract @interface ChatRetrofit {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/nobroker/myapplication/di/modules/NetworkModule$ChatOkkHttpClient;", "", "app_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.BINARY)
    @javax.inject.Qualifier
    public static abstract @interface ChatOkkHttpClient {
    }
}