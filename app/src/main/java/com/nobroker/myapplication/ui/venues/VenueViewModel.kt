package com.nobroker.myapplication.ui.venues

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.nobroker.chatSdk.base.BaseViewModel
import com.nobroker.myapplication.utils.OperationResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VenueViewModel @Inject constructor(
    private val repository: VenueRepositoryImpl
) : BaseViewModel() {

    private val _venues = MutableLiveData<List<VenueViewData>>()
    val venues: LiveData<List<VenueViewData>> get() = _venues

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
            repository.getVenues(clientId, perPage, page, lat, lon, range, query).collect { state ->

                when (state) {
                    is OperationResult.Error -> if (state.data != null) {
                        _showLoader.postValue(false)
                        _error.postValue(state.message)
                    }

                    is OperationResult.Loading -> {
                        //show loading
                        _showLoader.postValue(true)
                    }

                    is OperationResult.Success -> {
                        _showLoader.postValue(false)
                        if (state.data != null)
                            _venues.postValue(state.data.map {
                                VenueViewData(
                                    it.url,
                                    it.name,
                                    it.city,
                                    it.displayLocation
                                )
                            })
                    }
                }
            }

        }
    }
}
