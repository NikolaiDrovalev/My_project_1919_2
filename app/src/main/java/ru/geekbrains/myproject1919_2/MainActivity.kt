package ru.geekbrains.myproject1919_2

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cityName = findViewById<TextView>(R.id.city)
        val cityTemp = findViewById<TextView>(R.id.temperature)
        Card(cityName.setText("Москва").toString(), cityTemp.setText("25").hashCode())

        val button = findViewById<MaterialButton>(R.id.btn)
        button.setOnClickListener {
            Toast.makeText(this, "Нажали на кнопку", Toast.LENGTH_SHORT).show()

            val card = Card(city = "", 0)
            card.copy(
                city = cityName.setText("Казань").toString(),
                temperature = cityTemp.setText("32").hashCode()
            )

        }

        for (i in 1..3){
            Log.d("logs", "$i Kotlin")
        }

        val list = listOf(1,2,3,4,5)
        list.forEach{
            Log.d("logs","$it I love Kotlin")
        }

        repeat(10){
            Log.d("logs", "$it Hello Kotlin")
        }
    }
}


data class Card(val city: String, val temperature: Int)

