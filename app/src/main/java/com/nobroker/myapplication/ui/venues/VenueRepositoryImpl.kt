package com.nobroker.myapplication.ui.venues

import android.content.Context
import com.nobroker.myapplication.data.remote.RemoteRepo
import com.nobroker.myapplication.data.remote.dto.Venue
import com.nobroker.myapplication.utils.OperationResult
import com.nobroker.myapplication.utils.Utils
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

interface VenueRepo {
    suspend fun getVenues(
        clientId: String,
        perPage: Int,
        page: Int,
        lat: Double,
        lon: Double,
        range: String,
        query: String
    ): Flow<OperationResult<List<Venue>>>

}

class VenueRepositoryImpl @Inject constructor(
    private val remoteRepo: RemoteRepo,
    @dagger.hilt.android.qualifiers.ApplicationContext private val applicationContext: Context
//    private val cachedRepo:CachedRepo     (TODO: couldn't implement due to lack of time)
) : VenueRepo {

    override suspend fun getVenues(
        clientId: String,
        perPage: Int,
        page: Int,
        lat: Double,
        lon: Double,
        range: String,
        query: String
    ): Flow<OperationResult<List<Venue>>> = flow {
        emit(OperationResult.Loading())
        if (Utils.isInternetAvailable(applicationContext)) {
            val result = remoteRepo.getVenues(
                clientId,
                perPage,
                page,
                lat,
                lon,
                range,
                query
            )
            if (result is OperationResult.Success) {
                emit(result)
//                cachedRepo.saveCryptoData(result.data!!)
            } else if (result is OperationResult.Error) {
                val errorState = OperationResult.Error<List<Venue>>(result.message,null)
                emit(errorState)
            }
        } else {
           //todo: fetch from cache
        }
    }
}
