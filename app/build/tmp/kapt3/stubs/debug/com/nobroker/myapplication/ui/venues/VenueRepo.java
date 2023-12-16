package com.nobroker.myapplication.ui.venues;

import android.content.Context;
import com.nobroker.myapplication.data.remote.RemoteRepo;
import com.nobroker.myapplication.data.remote.dto.Venue;
import com.nobroker.myapplication.utils.OperationResult;
import com.nobroker.myapplication.utils.Utils;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J[\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/nobroker/myapplication/ui/venues/VenueRepo;", "", "getVenues", "Lkotlinx/coroutines/flow/Flow;", "Lcom/nobroker/myapplication/utils/OperationResult;", "", "Lcom/nobroker/myapplication/data/remote/dto/Venue;", "clientId", "", "perPage", "", "page", "lat", "", "lon", "range", "query", "(Ljava/lang/String;IIDDLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface VenueRepo {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getVenues(@org.jetbrains.annotations.NotNull
    java.lang.String clientId, int perPage, int page, double lat, double lon, @org.jetbrains.annotations.NotNull
    java.lang.String range, @org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.nobroker.myapplication.utils.OperationResult<java.util.List<com.nobroker.myapplication.data.remote.dto.Venue>>>> continuation);
}