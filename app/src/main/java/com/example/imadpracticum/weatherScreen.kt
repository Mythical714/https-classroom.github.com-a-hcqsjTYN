package com.example.imadpracticum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class weatherScreen : AppCompatActivity() {
    val weather= arrayOf<String>("Monday, 22°C" ,"Tuesday, 29°C", "Wednesday, 17°C", "Thursday, 19°C", "Friday, 23°C", "Saturday, 17°C", "Sunday, 17°C")
    val temp = arrayOf("22"
    ,"29",
        "17",
        "19",
        "23",
        "17",
        "17")
    var weather1 = arrayOf("","","","","","","")
    var counter = 0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather_screen)

        val arrayDisplay = findViewById<TextView>(R.id.arrayDisplay)
        val nextScreen= findViewById<Button>(R.id.nextSreen)
        val averageButton= findViewById<Button>(R.id.averageButton)
        val averageDisplay = findViewById<TextView>(R.id.averageDisplay)

        var weatherDisplay = ""
        var counter = 0
        while (counter < 7) {
            weatherDisplay += "${weather[counter]}\n"
            counter++
           }
        arrayDisplay.text=weatherDisplay

        averageButton.setOnClickListener(){
            var final = (22 + 29 + 17 + 17 + 23 + 19 + 17) / 7
            averageDisplay.text ="The average for this wek is $final"
        }
        nextScreen.setOnClickListener(){
            val intent = Intent(this, detailedScreen::class.java)//(IIE,2024)
            intent.putExtra("final", arrayDisplay.text.toString())//(IIE,2024)
            startActivity(intent)//(IIE,2024)
        }
        }
    }