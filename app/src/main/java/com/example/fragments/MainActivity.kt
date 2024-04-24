package com.example.fragments

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import com.example.fragments.R.id.button_to_fragment

lateinit var userTextView: TextView

class MainActivity : AppCompatActivity(), Communicator {

    fun goToFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.Fragment_place, FirstFragment.newInstance()).commit()

    }

    fun goToSecondFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.Fragment_place, SecondFragment.newInstance()).commit()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentHolder = findViewById<FragmentContainerView>(R.id.Fragment_place)
        val myButton: Button = findViewById(button_to_fragment)




        myButton.setOnClickListener {
            goToSecondFragment(fragment = Fragment())

        }



        goToFragment(fragment = Fragment())


    }

    override fun passDataCom(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("message", editTextInput)

        val transaction = this.supportFragmentManager.beginTransaction()
        val secondFragment = SecondFragment()
        secondFragment.arguments = bundle

        transaction.replace(R.id.Fragment_place, secondFragment)
        transaction.commit()
    }

}
