package com.example.amgus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        var text = findViewById<TextView>(R.id.TextView)
        var pos = intent.extras?.getInt("name") ?: 0
        var name = pos + 1
        text.text = name.toString()
        var count = intent.extras?.getInt("count") ?: 0

    }
}