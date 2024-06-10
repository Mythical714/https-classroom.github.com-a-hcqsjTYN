package com.example.imadpracticum

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
        val arrayButton = findViewById<Button>(R.id.arrayButton)
        val averageButton= findViewById<Button>(R.id.arrayButton)
        val averageDisplay = findViewById<TextView>(R.id.averageDisplay)

        arrayButton.setOnClickListener(){
            var weatherDisplay = ""
            var counter = 0
            while (counter < 7) {
                weatherDisplay += "${weather[counter]}\n"
                counter++
            }
            arrayDisplay.text=weatherDisplay

        }
        /*averageButton.setOnClickListener(){
            var average : Int = 7
            var averageDisplay = ""
            var counter = 0
            var array = temp[1+2+3+4+5+6+7]
            var answer = array + 0 /  average
        }*/
    }
}