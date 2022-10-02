package com.example.lab1_kt

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import com.example.lab1_kt.databinding.ActivityHelloactBinding
import kotlin.random.Random

class HelloActivity : Activity() {

    private lateinit var binding : ActivityHelloactBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelloactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var counter = 0

        

        binding.buttonLeft.setOnClickListener {
            counter ++
            binding.textView1.text = "$counter"
            binding.textView1.setTextColor(Color.rgb(Random.nextInt(0,255),Random.nextInt(0,255),Random.nextInt(0,255)))

        }
        binding.buttonRight.setOnClickListener {
            counter --
            binding.textView1.text = "$counter"
            binding.textView1.setTextColor(Color.rgb(Random.nextInt(0,255),Random.nextInt(0,255),Random.nextInt(0,255)))
        }





    }
}