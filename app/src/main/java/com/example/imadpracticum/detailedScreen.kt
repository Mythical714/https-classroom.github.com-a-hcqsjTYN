package com.example.imadpracticum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class detailedScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_screen)

        val answerButton = findViewById<Button>(R.id.averageButton)
        val feedback = findViewById<TextView>(R.id.feedback)
        val backButton = findViewById<Button>(R.id.backButton)
        val weatherView = findViewById<ImageView>(R.id.weatherImage)

        feedback.text= "On monday it is expected to be warm, we advise you to wear light clothing" +
                "On Tuesday is expected to be extremely hot, we again advise you to wear light clothing" +
                  "On Wednesday it is expected to be a rainy day, we advise you to stay indoors or wear heavy clothing" +
                 "On Thursday its expected to be a cloudy day, we advise you to wear warm clothing" +
                  "On Friday its expected to be warm so we advise you to wear light clothing" +
                 "On Saturday its expected to rainy with a chance of thunder, we advise you to wear heavy and stay indoors" +
                  "On Sunday yet again the temperatures are the same as Saturday, we advise you to stay indoors"//(IIE, 2024)

        backButton.setOnClickListener() {
            val intent = Intent(this, weatherScreen::class.java)//(IIE,2024)
            intent.putExtra("final", feedback.text.toString())//(IIE,2024)
            startActivity(intent)//(IIE,2024)
        }
        }
            }

//Reference