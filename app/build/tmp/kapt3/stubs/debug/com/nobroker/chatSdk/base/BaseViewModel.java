package com.nobroker.chatSdk.base;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.nobroker.myapplication.utils.MyErrors;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J$\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/nobroker/chatSdk/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_error", "Landroidx/lifecycle/MutableLiveData;", "", "get_error", "()Landroidx/lifecycle/MutableLiveData;", "set_error", "(Landroidx/lifecycle/MutableLiveData;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "error", "Landroidx/lifecycle/LiveData;", "getError", "()Landroidx/lifecycle/LiveData;", "setError", "(Landroidx/lifecycle/LiveData;)V", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleError", "", "e", "", "methodName", "logEvent", "eventSubType", "data", "", "", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> _error;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.LiveData<java.lang.String> error;
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    private final kotlin.coroutines.CoroutineContext coroutineContext = null;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final androidx.lifecycle.MutableLiveData<java.lang.String> get_error() {
        return null;
    }
    
    protected final void set_error(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<java.lang.String> p0) {
    }
    
    public void handleError(@org.jetbrains.annotations.NotNull
    java.lang.Throwable e, @org.jetbrains.annotations.NotNull
    java.lang.String methodName) {
    }
    
    public void logEvent(@org.jetbrains.annotations.NotNull
    java.lang.String eventSubType, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.Object> data) {
    }
}