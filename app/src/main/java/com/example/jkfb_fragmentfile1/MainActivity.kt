package com.example.jkfb_fragmentfile1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {

    val fragmentManager : FragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(findViewById<FrameLayout>(R.id.frameLayout) != null){
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.frameLayout, FirstFragment())
            fragmentTransaction.commit()
        }
    }

    fun onClickFirst(view: View) {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameLayout, FirstFragment())
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
    fun onClickSecond(view: View) {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameLayout, SecondFragment())
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}