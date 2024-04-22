package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.navigation.Navigation

class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val buttonToSecondFragment: Button? = view?.findViewById(R.id.buttonToSecondFragment)


        val view = inflater.inflate(R.layout.fragment_first, container, false)

        buttonToSecondFragment?.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
        }

        return view
    }

    companion object FragmentOne {

        @JvmStatic
        fun newInstance() = FirstFragment()
    }
}