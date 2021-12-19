package com.example.amgus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val clickerButton = findViewById<Button>(R.id.clicker_button)

        clickerButton.setOnClickListener {
            val intent = Intent(this, ClickerActivity::class.java)
            startActivity(intent)
        }
    }
}