package com.nobroker.myapplication.di.modules

import com.nobroker.myapplication.data.remote.NetworkHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Qualifier
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    @ChatRetrofit
    fun provideRetrofitInstance(@ChatOkkHttpClient okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.seatgeek.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    @Provides
    @Singleton
    @ChatOkkHttpClient
    fun provideOkHttpClient(
        @InterceptorHeader header: Interceptor
    ): OkHttpClient {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BASIC

        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .addInterceptor(header)
            .build()
    }

    @Provides
    @Singleton
    @InterceptorHeader
    fun provideHeaders(): Interceptor {
        return Interceptor { chain ->
            val request: Request =
                chain.request().newBuilder()
                    .addHeader("apiKey", "0294e9429b86765f56970d54d58cfe8260d6448c").build()
            chain.proceed(request)
        }

    }

    /*  @Provides
      @Singleton
      fun provideSharedPreference(): SharedPreferenceHelper {
          return SharedPreferenceHelper()
      }
  */
    @Provides
    @Singleton
    fun provideNetworkHelper(@ChatRetrofit retrofit: Retrofit): NetworkHelper {
        return retrofit.create(NetworkHelper::class.java)
    }

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class InterceptorHeader

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class ChatRetrofit

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class ChatOkkHttpClient

}