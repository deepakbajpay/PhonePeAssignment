package com.nobroker.chatSdk.base

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nobroker.myapplication.utils.MyErrors
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

abstract class BaseViewModel(
//    private val logEvent: LogEvent
) : ViewModel() {

    protected var _error: MutableLiveData<String> = MutableLiveData()
    var error: LiveData<String> = _error

    private val handler = CoroutineExceptionHandler { _, exception ->
        handleError(exception, "CoroutineExceptionHandler")
    }

    private val coroutineContext = Dispatchers.IO + handler

    open fun handleError(e: Throwable, methodName: String) {
        var msg = ""
        msg = when (e) {
            is MyErrors.ApiError -> e.code + " : " + e.msg
            is MyErrors.EmptyData -> e.msg
            else -> e.message ?: e.localizedMessage ?: ""
        }
        Log.e(this::class.simpleName, "$methodName: $msg")
        _error.postValue(msg)
        logEvent(
            "Exception", mutableMapOf(
                "message" to (e.message ?: ""),
                "methodName" to methodName
            )
        )
    }

    open fun logEvent(eventSubType: String, data: MutableMap<String, Any>) {
        viewModelScope.launch(coroutineContext) {
        }
    }
}