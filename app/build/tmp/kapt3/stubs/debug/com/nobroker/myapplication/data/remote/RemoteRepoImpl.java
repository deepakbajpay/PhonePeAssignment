package com.nobroker.myapplication.data.remote;

import com.nobroker.myapplication.data.remote.dto.Venue;
import com.nobroker.myapplication.di.modules.IoDispatcher;
import com.nobroker.myapplication.utils.OperationResult;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JU\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/nobroker/myapplication/data/remote/RemoteRepoImpl;", "Lcom/nobroker/myapplication/data/remote/RemoteRepo;", "networkHelper", "Lcom/nobroker/myapplication/data/remote/NetworkHelper;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/nobroker/myapplication/data/remote/NetworkHelper;Lkotlinx/coroutines/CoroutineDispatcher;)V", "getVenues", "Lcom/nobroker/myapplication/utils/OperationResult;", "", "Lcom/nobroker/myapplication/data/remote/dto/Venue;", "clientId", "", "perPage", "", "page", "lat", "", "lon", "range", "query", "(Ljava/lang/String;IIDDLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RemoteRepoImpl implements com.nobroker.myapplication.data.remote.RemoteRepo {
    private final com.nobroker.myapplication.data.remote.NetworkHelper networkHelper = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    
    @javax.inject.Inject
    public RemoteRepoImpl(@org.jetbrains.annotations.NotNull
    com.nobroker.myapplication.data.remote.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull
    @com.nobroker.myapplication.di.modules.IoDispatcher
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getVenues(@org.jetbrains.annotations.NotNull
    java.lang.String clientId, int perPage, int page, double lat, double lon, @org.jetbrains.annotations.NotNull
    java.lang.String range, @org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.nobroker.myapplication.utils.OperationResult<java.util.List<com.nobroker.myapplication.data.remote.dto.Venue>>> continuation) {
        return null;
    }
}