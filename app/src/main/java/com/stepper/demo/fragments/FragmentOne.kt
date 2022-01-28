package com.stepper.demo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.stepper.demo.R

class FragmentOne: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        layoutInflater.inflate(R.layout.fragment_one, container, false)

        return super.onCreateView(inflater, container, savedInstanceState)
    }
}