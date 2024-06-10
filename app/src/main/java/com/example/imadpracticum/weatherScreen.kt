package com.example.imadpracticum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class weatherScreen : AppCompatActivity() {
    val weather= arrayOf<String>("Monday, 22°C" ,"Tuesday, 29°C", "Wednesday, 17°C", "Thursday, 19°C", "Friday, 23°C", "Saturday, 17°C", "Sunday, 17°C") //(IIE,2024) //array for the app
    val temp = arrayOf("22"
    ,"29",
        "17",
        "19",
        "23",
        "17",
        "17") //(IIE,2024)
    var weather1 = arrayOf("","","","","","","") //(IIE,2024)
    var counter = 0 //(IIE,2024)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather_screen)

        val arrayDisplay = findViewById<TextView>(R.id.arrayDisplay) //(IIE,2024)
        val nextScreen= findViewById<Button>(R.id.nextSreen) //(IIE,2024)
        val averageButton= findViewById<Button>(R.id.averageButton) //(IIE,2024)
        val averageDisplay = findViewById<TextView>(R.id.averageDisplay) //(IIE,2024)
        val clearButton = findViewById<Button>(R.id.clearButton)

        var weatherDisplay = "" //(IIE,2024) //helps display the array
        var counter = 0 //(IIE,2024)
        while (counter < 7) { //(IIE,2024) //while loop for the array
            weatherDisplay += "${weather[counter]}\n" //(IIE,2024) //displays the array
            counter++ //(IIE,2024)
           }
        arrayDisplay.text=weatherDisplay //(IIE,2024)

        averageButton.setOnClickListener(){ //(IIE,2024)
            var final = (22 + 29 + 17 + 17 + 23 + 19 + 17) / 7 //IIE,2024) //average for the weekly weather
            averageDisplay.text ="The average for this wek is $final" //(IIE,2024) //displays the average
        }
        nextScreen.setOnClickListener(){
            val intent = Intent(this, detailedScreen::class.java)//(IIE,2024)
            intent.putExtra("final", arrayDisplay.text.toString())//(IIE,2024) moves the app to the next screen
            startActivity(intent)//(IIE,2024)
        }
        clearButton.setOnClickListener(){
            averageDisplay.text = ""
        }
        }
    }