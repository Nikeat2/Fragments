package com.example.fragments

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

var TAG: String = "SomeSpecialName ${MainActivity::class.java.simpleName}"  // это должна быть как минимум val а лучше еще и константа: 

// лишнаяя строка
class SecondActivity : AppCompatActivity() {

// лишнаяя строка
// лишнаяя строка
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        }

// лишнаяя строка
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "In onStart")
// лишнаяя строка
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "In onResume")

        val button2: Button = findViewById(R.id.button_to_start_fragment)  // так себе название кнопки

        fun goToFragment(fragment: Fragment) {   // зачем метод внутри метода сделал? определенно его вынести из метода 
            supportFragmentManager
                .beginTransaction().replace(R.id.fragment_home, FirstFragment.newInstance()).commit()
        }
            button2.setOnClickListener { goToFragment(Fragment()) }
// лишнаяя строка
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
// лишнаяя строка
    }
// лишнаяя строка
}
