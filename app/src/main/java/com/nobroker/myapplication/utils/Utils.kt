package com.nobroker.myapplication.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

class Utils {


   /**
    * Check if the device has an internet connection.
    *
    * @return True if the device is connected to a network which also gives it access to the internet.
    * False otherwise.
    */


   companion object {


       fun isInternetAvailable(context: Context): Boolean {
           val connectivityManager =
               context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
                   ?: return false


           val activeNetwork = connectivityManager.activeNetwork ?: return false
           val capabilities =
               connectivityManager.getNetworkCapabilities(activeNetwork) ?: return false


           // If we check only for "NET_CAPABILITY_INTERNET", we get "true" if we are connected to a wifi
           // which has no access to the internet. "NET_CAPABILITY_VALIDATED" also verifies that we
           // are online
           return capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) && capabilities.hasCapability(
               NetworkCapabilities.NET_CAPABILITY_VALIDATED
           )
       }


   }
}
