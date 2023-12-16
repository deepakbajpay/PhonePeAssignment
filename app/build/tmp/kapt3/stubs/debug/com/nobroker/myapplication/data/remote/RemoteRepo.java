package com.nobroker.myapplication.data.remote;

import com.nobroker.myapplication.data.remote.dto.Venue;
import com.nobroker.myapplication.di.modules.IoDispatcher;
import com.nobroker.myapplication.utils.OperationResult;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JU\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/nobroker/myapplication/data/remote/RemoteRepo;", "", "getVenues", "Lcom/nobroker/myapplication/utils/OperationResult;", "", "Lcom/nobroker/myapplication/data/remote/dto/Venue;", "clientId", "", "perPage", "", "page", "lat", "", "lon", "range", "query", "(Ljava/lang/String;IIDDLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RemoteRepo {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getVenues(@org.jetbrains.annotations.NotNull
    java.lang.String clientId, int perPage, int page, double lat, double lon, @org.jetbrains.annotations.NotNull
    java.lang.String range, @org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.nobroker.myapplication.utils.OperationResult<java.util.List<com.nobroker.myapplication.data.remote.dto.Venue>>> continuation);
}