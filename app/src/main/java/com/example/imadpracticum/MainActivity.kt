package com.example.imadpracticum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weatherButton = findViewById<Button>(R.id.weatherButton) //(IIE,2024)
        val userInfo = findViewById<TextView>(R.id.userInfo) //(IIE,2024)
        val appName = findViewById<TextView>(R.id.appName) //(IIE,2024)

        weatherButton.setOnClickListener() { //(IIE,2024)
            val intent = Intent(this, weatherScreen::class.java)//(IIE,2024)
            intent.putExtra("main", userInfo.text.toString())//(IIE,2024)
            startActivity(intent)//(IIE,2024)
        }
    }
}