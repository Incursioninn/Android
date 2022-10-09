package com.example.lab2_kt

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    object Logs{
        const val DEBUG = "MainActDebug"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(Logs.DEBUG , "onCreate")
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

    override fun onStart() {
        super.onStart()
        Log.d(Logs.DEBUG , "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Logs.DEBUG , "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(Logs.DEBUG , "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Logs.DEBUG , "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(Logs.DEBUG , "OnDestroy")

    }

    private fun switchActivities() {
        val switchActivityIntent = Intent(this, ListActivity::class.java)
        startActivity(switchActivityIntent)
    }

}