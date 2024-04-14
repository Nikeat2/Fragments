package com.example.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment

private lateinit var userText: EditText

class FirstFragment : Fragment() {
    var userText = R.id.User_text

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fun intention() {
            val intent = Intent()
            intent.putExtra("Text", userText.toString())
            ActivityResultContracts.StartActivityForResult()
        }

        intention()


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    companion object FragmentOne {

        @JvmStatic
        fun newInstance() = FirstFragment()


    }

}