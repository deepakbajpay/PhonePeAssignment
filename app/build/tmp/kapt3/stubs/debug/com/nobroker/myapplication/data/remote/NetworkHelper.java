package com.nobroker.myapplication.data.remote;

import com.nobroker.myapplication.data.remote.dto.VenueResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J]\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/nobroker/myapplication/data/remote/NetworkHelper;", "", "getVenues", "Lretrofit2/Response;", "Lcom/nobroker/myapplication/data/remote/dto/VenueResponse;", "clientId", "", "perPage", "", "page", "lat", "", "lon", "range", "query", "(Ljava/lang/String;IIDDLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NetworkHelper {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "2/venues")
    public abstract java.lang.Object getVenues(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "client_id")
    java.lang.String clientId, @retrofit2.http.Query(value = "per_page")
    int perPage, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "lat")
    double lat, @retrofit2.http.Query(value = "lon")
    double lon, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "range")
    java.lang.String range, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "q")
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.nobroker.myapplication.data.remote.dto.VenueResponse>> continuation);
}