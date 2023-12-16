package com.nobroker.myapplication.ui.venues;

import android.content.Context;
import com.nobroker.myapplication.data.remote.RemoteRepo;
import com.nobroker.myapplication.data.remote.dto.Venue;
import com.nobroker.myapplication.utils.OperationResult;
import com.nobroker.myapplication.utils.Utils;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J[\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/nobroker/myapplication/ui/venues/VenueRepositoryImpl;", "Lcom/nobroker/myapplication/ui/venues/VenueRepo;", "remoteRepo", "Lcom/nobroker/myapplication/data/remote/RemoteRepo;", "applicationContext", "Landroid/content/Context;", "(Lcom/nobroker/myapplication/data/remote/RemoteRepo;Landroid/content/Context;)V", "getVenues", "Lkotlinx/coroutines/flow/Flow;", "Lcom/nobroker/myapplication/utils/OperationResult;", "", "Lcom/nobroker/myapplication/data/remote/dto/Venue;", "clientId", "", "perPage", "", "page", "lat", "", "lon", "range", "query", "(Ljava/lang/String;IIDDLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class VenueRepositoryImpl implements com.nobroker.myapplication.ui.venues.VenueRepo {
    private final com.nobroker.myapplication.data.remote.RemoteRepo remoteRepo = null;
    private final android.content.Context applicationContext = null;
    
    @javax.inject.Inject
    public VenueRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.nobroker.myapplication.data.remote.RemoteRepo remoteRepo, @org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context applicationContext) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getVenues(@org.jetbrains.annotations.NotNull
    java.lang.String clientId, int perPage, int page, double lat, double lon, @org.jetbrains.annotations.NotNull
    java.lang.String range, @org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.nobroker.myapplication.utils.OperationResult<java.util.List<com.nobroker.myapplication.data.remote.dto.Venue>>>> continuation) {
        return null;
    }
}