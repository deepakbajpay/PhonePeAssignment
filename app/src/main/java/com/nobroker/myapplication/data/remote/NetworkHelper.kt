package com.nobroker.myapplication.data.remote

import com.nobroker.myapplication.data.remote.dto.VenueResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkHelper {

    @GET("2/venues")
    suspend fun getVenues(
        @Query("client_id") clientId: String,
        @Query("per_page") perPage: Int,
        @Query("page") page: Int,
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("range") range: String,
        @Query("q") query: String
    ): Response<VenueResponse>


}