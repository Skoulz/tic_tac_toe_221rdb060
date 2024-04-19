package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class GreetingMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.greeting)

        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val startGameButton = findViewById<Button>(R.id.startGameButton)

        startGameButton.setOnClickListener {
            val playerName = nameEditText.text.toString()
            startActivity(Intent(this, MainActivity::class.java))
        }


    }
}