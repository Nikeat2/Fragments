package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class SecondFragment : Fragment() {

    var userTextView: String? = ""

    val userText: TextView? = view?.findViewById(R.id.userTextView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val textView: TextView = view.findViewById(R.id.userTextView)
        val args = this.arguments
        val inputData = args?.getString("message")
        textView.text = inputData.toString()

        return view
    }


    companion object FragmentOne {

        @JvmStatic
        fun newInstance() = SecondFragment()
    }
}