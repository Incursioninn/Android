package com.example.lab1_kt

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class HelloActivity : Activity() {

    private lateinit var buttonInc : Button
    private lateinit var buttonDec : Button
    private lateinit var textView: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actibity_helloact)
        var counter = 0

        buttonInc = findViewById(R.id.buttonLeft)
        buttonDec = findViewById(R.id.buttonRight)
        textView =  findViewById(R.id.textView1)





        buttonInc.setOnClickListener {
            counter ++
            textView.text = "$counter"
            textView.setTextColor(Color.rgb(Random.nextInt(0,255),Random.nextInt(0,255),Random.nextInt(0,255)))

        }
        buttonDec.setOnClickListener {
            counter --
            textView.text = "$counter"
            textView.setTextColor(Color.rgb(Random.nextInt(0,255),Random.nextInt(0,255),Random.nextInt(0,255)))
        }





    }
}