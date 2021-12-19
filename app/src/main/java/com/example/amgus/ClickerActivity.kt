package com.example.amgus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.TextView

class ClickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clicker)

        var clickCount = PreferenceManager.getDefaultSharedPreferences(applicationContext).getInt("clickCount", 0)
        val clickButton = findViewById<Button>(R.id.click_button)
        val clicks = findViewById<TextView>(R.id.clicks)

        clickButton.setOnClickListener {
            clickCount++
            clicks.text = clickCount.toString()
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit().putInt("clickCount", clickCount).apply()
        }


    }
}