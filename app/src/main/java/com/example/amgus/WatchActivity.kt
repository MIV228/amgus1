package com.example.amgus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class WatchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_watch)

        val editText = findViewById<EditText>(R.id.editText)
        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        val textView = findViewById<TextView>(R.id.textView)
        var isChecked = PreferenceManager.getDefaultSharedPreferences(applicationContext).getBoolean("isChecked", false)
        checkBox.isChecked = isChecked
//        var editTextText = PreferenceManager.getDefaultSharedPreferences(applicationContext).getString("editTextText", "")
//        editText.text.toString() = editTextText.toString()

        val textWatcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if (s.contains("amgus")) {
                    textView.text = "SUS"
                } else {
                    editText.error = "Oh yeah"
                    textView.text = "ААААА МИШК ФРЕДЕ"
                }
//                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit().putString("editTextText", s.toString()).apply()
            }
            override fun afterTextChanged(s: Editable?) {}
        }

        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                editText.addTextChangedListener(textWatcher)
            } else {
                editText.removeTextChangedListener(textWatcher)
                textView.text = ""
            }
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit().putBoolean("isChecked", isChecked).apply()
        }
    }
}