package com.example.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView


class MainActivity : AppCompatActivity() {
    private fun goToFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentPlace, FirstFragment.newInstance()).commit()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToFragment()
    }

}
