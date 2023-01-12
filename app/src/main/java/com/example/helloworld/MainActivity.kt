package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.*

class MainActivity : AppCompatActivity() {
    // on create is f() that is the life cycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val button =  findViewById<Button>(R.id.helloButtonId)
        button.setOnClickListener {
            Log.v("GD", "message clicked")
            // Toast is short way of displaying the information to the user
            Toast.makeText(this,"hello to you too!", LENGTH_SHORT).show()
        }
    }
}