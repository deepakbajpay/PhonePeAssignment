package com.nobroker.myapplication.ui.venues

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.nobroker.chatSdk.base.BaseViewModel
import com.nobroker.myapplication.data.remote.dto.Venue
import com.nobroker.myapplication.utils.OperationResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VenueViewModel @Inject constructor(
    private val repository: VenueRepositoryImpl
) : BaseViewModel() {

    private val _venues = MutableLiveData<OperationResult<List<Venue>>>()
    val venues: LiveData<OperationResult<List<Venue>>>get() = _venues

    fun getVenues(
        clientId: String,
        perPage: Int,
        page: Int,
        lat: Double,
        lon: Double,
        range: String,
        query: String
    ) {
        viewModelScope.launch {
            // Fetch venues from the repository
            repository.getVenues(clientId, perPage, page, lat, lon, range, query).collect{
                _venues.postValue(it)
            }

        }
    }
}
