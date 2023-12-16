package com.nobroker.myapplication.di.modules

import com.nobroker.myapplication.data.remote.RemoteRepo
import com.nobroker.myapplication.data.remote.RemoteRepoImpl
import com.nobroker.myapplication.ui.venues.VenueRepo
import com.nobroker.myapplication.ui.venues.VenueRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {

//
//   @Singleton
//   @Binds
//   abstract fun providesCachedRepo(venueLocalRepoImpl: CachedRepoImpl): CachedRepo


    @Singleton
    @Binds
    abstract fun providesRemoteRepo(venueRemoteRepoImpl: RemoteRepoImpl): RemoteRepo


    @Singleton
    @Binds
    abstract fun providesVenueRepo(venueRepoImpl: VenueRepositoryImpl): VenueRepo

}
