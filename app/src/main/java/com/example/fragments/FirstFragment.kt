package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

private lateinit var userText: EditText

class FirstFragment : Fragment() {
    var userText = view?.findViewById<EditText>(R.id.User_text)

    private lateinit var communicator: Communicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val buttonToText: Button = view.findViewById(R.id.btn)

        communicator = activity as Communicator

        buttonToText.setOnClickListener {
            communicator.passDataCom(userText?.text.toString())
        }




        return view


    }

    companion object FragmentOne {

        @JvmStatic
        fun newInstance() = FirstFragment()


    }

}