package com.example.amgus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login = findViewById<EditText>(R.id.login)
        var loginText = login.text.toString()
        findViewById<Button>(R.id.button).setOnClickListener {
            if (loginText != "sussybaka") {
                login.error = "Неверный пароль."
            }
        }
    }
}