package com.nobroker.myapplication.data.remote

import com.nobroker.myapplication.data.remote.dto.Venue
import com.nobroker.myapplication.di.modules.IoDispatcher
import com.nobroker.myapplication.utils.OperationResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

interface RemoteRepo {
    suspend fun getVenues(
        clientId: String,
        perPage: Int,
        page: Int,
        lat: Double,
        lon: Double,
        range: String,
        query: String
    ): OperationResult<List<Venue>>

}

class RemoteRepoImpl @Inject constructor(
    private val networkHelper: NetworkHelper,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) : RemoteRepo {
    override suspend fun getVenues(
        clientId: String,
        perPage: Int,
        page: Int,
        lat: Double,
        lon: Double,
        range: String,
        query: String
    ): OperationResult<List<Venue>> = withContext(dispatcher) {
            try {
                val result = networkHelper.getVenues(
                    clientId,
                    perPage,
                    page,
                    lat,
                    lon,
                    range,
                    query
                )

                if (result.isSuccessful) {
                    return@withContext OperationResult.Success<List<Venue>>(result.body()!!.venues)
                } else if (result.errorBody() != null) {
                    return@withContext OperationResult.Error<List<Venue>>(result.message())
                } else {
                    return@withContext OperationResult.Error<List<Venue>>("Something went wrong")
                }
            } catch (e: Exception) {
                return@withContext OperationResult.Error<List<Venue>>("Something went wrong")

            }

        }

}