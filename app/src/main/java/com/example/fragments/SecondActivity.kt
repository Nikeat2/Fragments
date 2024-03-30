package com.example.fragments

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

var TAG: String = "SomeSpecialName ${MainActivity::class.java.simpleName}"


class SecondActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, "In onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "In onResume")

        val button2: Button = findViewById(R.id.button_to_start_fragment)

        fun goToFragment(fragment: Fragment) {
            supportFragmentManager
                .beginTransaction().replace(R.id.fragment_home, FirstFragment.newInstance()).commit()
        }
            button2.setOnClickListener { goToFragment(Fragment()) }

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "In onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "In onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "In onDestroy")

    }

}