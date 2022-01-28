package com.stepper.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.aceinteract.android.stepper.StepperNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val stepper = findViewById<StepperNavigationView>(R.id.stepper)
        stepper.setupWithNavController(findNavController(R.id.frame_stepper))
    }
}