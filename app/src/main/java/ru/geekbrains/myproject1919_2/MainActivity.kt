package ru.geekbrains.myproject1919_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import ru.geekbrains.myproject1919_2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<MaterialButton>(R.id.btn)
        button.setOnClickListener{
            Toast.makeText(this, "Нажали на кнопку", Toast.LENGTH_SHORT).show()
        }
    }
}
