package com.nobroker.myapplication.utils

sealed class MyErrors : Exception() {
    data class ApiError(val code: String?, val msg: String? = null) : MyErrors()
    data class EmptyData(val msg: String = "Empty Data") : MyErrors()
    data class Invalid(val msg: String = "Invalid Data") : MyErrors()
}