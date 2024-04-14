package com.example.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.findViewTreeViewModelStoreOwner

lateinit var userText: EditText

class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)



    }

    var userText = R.id.User_text

    val intent = Intent()



    companion object FragmentOne {

        @JvmStatic
        fun newInstance() = FirstFragment()
    }
}