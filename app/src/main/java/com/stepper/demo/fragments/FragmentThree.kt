package com.stepper.demo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.stepper.demo.R

class FragmentThree: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        layoutInflater.inflate(R.layout.fragment_two, container, false)

        return super.onCreateView(inflater, container, savedInstanceState)
    }
}