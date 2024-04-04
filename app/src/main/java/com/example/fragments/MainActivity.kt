package com.example.fragments

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentHolder = findViewById<FragmentContainerView>(R.id.Fragment_place)
        val myButton: Button = findViewById(R.id.button_to_fragment)


        fun goToFragment(fragment: Fragment) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.Fragment_place, FirstFragment.newInstance()).commit()

        }

        fun goToSecondFragment(fragment: Fragment) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.Fragment_place, SecondFragment.newInstance()).commit()
        }

        myButton.setOnClickListener {
            goToSecondFragment(fragment = Fragment())
        }



        goToFragment(fragment = Fragment())


    }

}
