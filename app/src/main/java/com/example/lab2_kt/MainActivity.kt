package com.example.lab2_kt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login:String
        var password : String

        findViewById<Button>(R.id.loginButton).setOnClickListener(){
            login = findViewById<EditText>(R.id.editTextLogin).text.toString()
            password = findViewById<EditText>(R.id.editTextPassword).text.toString()
            if(login == "max" && password == "123" ) {
                findViewById<Button>(R.id.loginButton).text = "Log in success"
                switchActivities()
            }
            else
                findViewById<Button>(R.id.loginButton).text = "Log in denied"
        }


    }

    private fun switchActivities() {
        val switchActivityIntent = Intent(this, ListActivity::class.java)
        startActivity(switchActivityIntent)
    }

}