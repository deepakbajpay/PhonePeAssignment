package com.nobroker.myapplication.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/nobroker/myapplication/utils/Utils;", "", "()V", "Companion", "app_debug"})
public final class Utils {
    @org.jetbrains.annotations.NotNull
    public static final com.nobroker.myapplication.utils.Utils.Companion Companion = null;
    
    public Utils() {
        super();
    }
    
    /**
     * Check if the device has an internet connection.
     *
     * @return True if the device is connected to a network which also gives it access to the internet.
     * False otherwise.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/nobroker/myapplication/utils/Utils$Companion;", "", "()V", "isInternetAvailable", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isInternetAvailable(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return false;
        }
    }
}