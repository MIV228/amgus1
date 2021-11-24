package com.example.amgus

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var greenbutton = findViewById<Button>(R.id.green_button)
        var redbutton = findViewById<Button>(R.id.red_button)
        var yellowbutton = findViewById<Button>(R.id.yellow_button)
        greenbutton.setOnClickListener {
            var intent = Intent(this, ColorActivity::class.java)
            intent.putExtra("color", Color.GREEN)
            startActivity(intent)
        }
        redbutton.setOnClickListener {
            var intent = Intent(this, ColorActivity::class.java)
            intent.putExtra("color", Color.RED)
            startActivity(intent)
        }
        yellowbutton.setOnClickListener {
            var intent = Intent(this, ColorActivity::class.java)
            intent.putExtra("color", Color.YELLOW)
            startActivity(intent)
        }
    }
}