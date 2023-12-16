package com.nobroker.chatSdk.di.modules

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

import javax.inject.Singleton


@Module
@InstallIn(ActivityComponent::class)
class MainModule() {


    @Provides
    @Singleton
    fun provideGson(): Gson {
        return Gson()
    }
}

