package com.example.android.test1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

/**
 * A simple [Fragment] subclass.
 */
class entry2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.title=
            getString(R.string.text2)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_entry2, container, false)

}

}
