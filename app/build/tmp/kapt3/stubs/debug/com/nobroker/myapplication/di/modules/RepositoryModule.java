package com.nobroker.myapplication.di.modules;

import com.nobroker.myapplication.data.remote.RemoteRepo;
import com.nobroker.myapplication.data.remote.RemoteRepoImpl;
import com.nobroker.myapplication.ui.venues.VenueRepo;
import com.nobroker.myapplication.ui.venues.VenueRepositoryImpl;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/nobroker/myapplication/di/modules/RepositoryModule;", "", "()V", "providesRemoteRepo", "Lcom/nobroker/myapplication/data/remote/RemoteRepo;", "venueRemoteRepoImpl", "Lcom/nobroker/myapplication/data/remote/RemoteRepoImpl;", "providesVenueRepo", "Lcom/nobroker/myapplication/ui/venues/VenueRepo;", "venueRepoImpl", "Lcom/nobroker/myapplication/ui/venues/VenueRepositoryImpl;", "app_debug"})
@dagger.Module
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    @javax.inject.Singleton
    public abstract com.nobroker.myapplication.data.remote.RemoteRepo providesRemoteRepo(@org.jetbrains.annotations.NotNull
    com.nobroker.myapplication.data.remote.RemoteRepoImpl venueRemoteRepoImpl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    @javax.inject.Singleton
    public abstract com.nobroker.myapplication.ui.venues.VenueRepo providesVenueRepo(@org.jetbrains.annotations.NotNull
    com.nobroker.myapplication.ui.venues.VenueRepositoryImpl venueRepoImpl);
}