package com.example.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), Communicator {

    private fun goToFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.Fragment_place, FirstFragment()).addToBackStack("Thing").commit()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToFragment()

    }
    override fun passDataCom(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("message", editTextInput)

        val transaction = this.supportFragmentManager.beginTransaction()
        val secondFragment = SecondFragment()
        secondFragment.arguments = bundle

        transaction.add(R.id.Fragment_place, secondFragment).addToBackStack("Thing")
        transaction.commit()
    }

}
