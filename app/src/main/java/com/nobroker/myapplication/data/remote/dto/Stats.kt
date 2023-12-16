package com.nobroker.myapplication.data.remote.dto

import com.google.gson.annotations.SerializedName


data class Stats(
    @SerializedName("event_count")
    val eventCount: Int
)