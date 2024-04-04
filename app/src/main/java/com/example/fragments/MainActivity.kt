package com.example.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentHolder = findViewById<FragmentContainerView>(R.id.Fragment_place)


        fun goToFragment(fragment: Fragment) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.Fragment_place, FirstFragment.newInstance()).commit()

        }

        goToFragment(fragment = Fragment())
    }

}
