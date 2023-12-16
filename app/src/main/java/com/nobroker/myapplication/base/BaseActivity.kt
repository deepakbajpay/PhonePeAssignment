package com.nobroker.myapplication.base


import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


abstract class BaseActivity(@LayoutRes private val layout: Int) :
    AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout)
        setupView()
    }

    abstract fun setupView()


}