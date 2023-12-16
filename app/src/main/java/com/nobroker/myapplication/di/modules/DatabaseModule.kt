package com.nobroker.myapplication.di.modules

import android.content.Context
import androidx.room.Room
import com.nobroker.myapplication.data.local.AppDatabase
import com.nobroker.myapplication.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    @Singleton
    @Named("chat_db")
    fun provideDbName() = Constants.DB_NAME

    @Provides
    @Singleton
    fun provideAppDatabase(
        @Named("chat_db") dbName: String,
        @ApplicationContext context: Context
    ): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, dbName)
            .fallbackToDestructiveMigration()
            .build()
    }
    /*

        @Provides
        @Singleton
        fun getVenueDao(appDatabase: AppDatabase): VenueDao {
            return appDatabase.VenueDao()
        }
    */

}