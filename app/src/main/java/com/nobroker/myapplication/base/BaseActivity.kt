package com.nobroker.myapplication.base


import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


abstract class BaseActivity(@LayoutRes private val layout: Int) :
    AppCompatActivity() {

//    protected lateinit var rootView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //rootView = layoutInflater.inflate(layout, null)
        setContentView(layout)
        setupView()
        println("#### BaseActivity.onCreate")
    }

    abstract fun setupView()


    fun replaceFragment(fragment: Fragment, tag: String, addToBackStack: String? = null) {

        /*val transaction = supportFragmentManager.beginTransaction().setReorderingAllowed(true)
            .replace(R.id.main, fragment, tag)
        if (addToBackStack != null)
            transaction.addToBackStack(tag)
        transaction.commit()*/
    }

    fun addFragment(fragment: Fragment, tag: String, addToBackStack: String? = null) {

        /* val transaction = supportFragmentManager.beginTransaction()
             .add(R.id.main_fragment_container, fragment, tag)
         if (addToBackStack != null)
             transaction.addToBackStack(tag)
         transaction.commit()*/
    }


}