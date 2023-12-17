package com.nobroker.myapplication.utils

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


@BindingAdapter("setImage")
fun setImage(imageView: ImageView, url: String?) {
    Log.e("POSTERURL", "setImage: $url" )
    if (url != null) {
        Glide.with(imageView).load(url).into(imageView)
    }
}
