package com.nobroker.myapplication.data.remote.dto

import com.google.gson.annotations.SerializedName

data class VenueResponse(
    @SerializedName("meta")
    val meta: Meta,
    @SerializedName("venues")
    val venues: List<Venue>
)