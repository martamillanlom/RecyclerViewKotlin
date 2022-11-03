package com.example.fragmentskotlin.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.fragmentskotlin.R

class FormFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var view: View =  inflater.inflate(R.layout.fragment_form, container, false);

        var button : Button = view.findViewById(R.id.btnSave);


        return view;


    }
}