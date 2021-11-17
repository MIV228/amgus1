package com.example.amgus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login = findViewById<EditText>(R.id.login)
        var pass = findViewById<EditText>(R.id.pass)
        findViewById<Button>(R.id.button).setOnClickListener {
            if (login.text.toString() != "amgus") {
                login.error = "Неверное имя пользователя."
            } else if (pass.text.toString() != "sussybaka") {
                pass.error = "Неверный пароль."
            } else {
                var myDialogFragment = DialogFragment()
                var manager = supportFragmentManager
                var builder = AlertDialog.Builder(it)
                myDialogFragment.show(manager, "myDialog")
            }
        }
    }
}