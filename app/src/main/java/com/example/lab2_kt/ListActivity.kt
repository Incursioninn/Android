package com.example.lab2_kt

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class ListActivity : AppCompatActivity() {

    private lateinit var addButton: Button
    private lateinit var deleteButton: Button
    private lateinit var list: ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logic_activity)

        list = findViewById(R.id.textList)
        addButton = findViewById(R.id.buttonLeft)
        deleteButton = findViewById(R.id.buttonRight)




        var addArray  = mutableListOf<String>()
        val textAdapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, addArray)
        list.adapter = textAdapter
        val adderList : EditText = findViewById(R.id.editTextList)

        addButton.setOnClickListener(){

            addArray.add(adderList.text.toString())
            list.adapter = textAdapter

        }

        deleteButton.setOnClickListener(){
            if(addArray.isNotEmpty()){
             addArray.removeLast()
            }

            list.adapter = textAdapter

        }

        findViewById<Button>(R.id.buttonExit).setOnClickListener(){
            switchActivities()
        }


    }
   private fun switchActivities() {
        val switchActivityIntent = Intent(this, MainActivity::class.java)
        startActivity(switchActivityIntent)
    }
}