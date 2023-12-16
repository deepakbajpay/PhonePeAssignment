package com.nobroker.myapplication.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nobroker.myapplication.ui.venues.VenueRepositoryImpl
import com.nobroker.myapplication.ui.venues.VenueViewModel

class VenueViewModelFactory(
    private val repository: VenueRepositoryImpl
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return VenueViewModel(repository) as T
    }
}

