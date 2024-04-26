package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val buttonToSecondFragment: Button = view.findViewById(R.id.buttonToSecondFragment)

        buttonToSecondFragment.setOnClickListener {
            val secondFragment = SecondFragment()
            parentFragmentManager.beginTransaction().replace(R.id.fragmentHolder, secondFragment)
                .addToBackStack("Stuff").commit()
        }
        return view
    }
}
