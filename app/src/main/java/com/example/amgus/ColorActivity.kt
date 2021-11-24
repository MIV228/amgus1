package com.example.amgus

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class ColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)
        var container = findViewById<ConstraintLayout>(R.id.container)
        var color = intent.extras?.getInt("color") ?: Color.WHITE
        container.setBackgroundColor(color)
    }
}