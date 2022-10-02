package com.example.lab2_kt

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.lab2_kt.databinding.LogicActivityBinding


class ListActivity : AppCompatActivity() {


    private lateinit var binding : LogicActivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LogicActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var addArray  = mutableListOf<String>()
        val textAdapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, addArray)
        binding.textList.adapter = textAdapter

        binding.buttonLeft.setOnClickListener(){

            addArray.add(binding.editTextList.text.toString())
            binding.textList.adapter = textAdapter

        }

        binding.buttonRight.setOnClickListener(){
            if(addArray.isNotEmpty()){
             addArray.removeLast()
            }

            binding.textList.adapter = textAdapter

        }

       binding.buttonExit.setOnClickListener(){
            switchActivities()
        }


    }
   private fun switchActivities() {
        val switchActivityIntent = Intent(this, MainActivity::class.java)
        startActivity(switchActivityIntent)
    }
}