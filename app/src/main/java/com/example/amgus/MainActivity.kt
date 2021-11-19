package com.example.amgus

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    @SuppressLint("ShowToast", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val duration = 10000
        var login = findViewById<EditText>(R.id.login)
        var pass = findViewById<EditText>(R.id.pass)
        var container =
            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.container)
        var count = 0

        findViewById<Button>(R.id.button).setOnClickListener {
            if (login.text.toString() != "amgus" || pass.text.toString() != "sussybaka") {
                count++

                var list = listOf<String>(
                    "Неверные данные.",
                    "Неправильно ввел.",
                    "Ошибка: Неверно."
                )
                var str = list.random()
                var laststr = ""
                while (str == laststr) {
                    laststr = list.random()
                    continue
                }
                var snack = Snackbar.make(container, str, duration)
                str.also { laststr = it }
                var snack2 = Snackbar.make(container, "Я тебе помогу...", duration)
                snack2.setAction("\$sudo --run hack.exe") {
                    login.setText("amgus")
                    pass.setText("sussybaka")
                }

                snack.setAction("Хорошо") {
                    login.text.clear()
                    pass.text.clear()
                }

                if (count >= 3) {
                    snack.setAction("Взломать") {
                        snack2.show()
                    }
                    count = 0
                }
                snack.show()
            } else {
                var snack = Snackbar.make(container, "Чел харош", duration)
                snack.setAction("Крутой") {
                    login.text.clear()
                    pass.text.clear()
                }
                snack.show()
            }
        }
    }
}