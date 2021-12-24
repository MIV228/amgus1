package com.example.amgus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.amgus.Repository.clickCount

class ClickerActivity : AppCompatActivity() {

    var PlayerList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clicker)

        clickCount = PreferenceManager.getDefaultSharedPreferences(applicationContext).getInt("clickCount", 0)
        val clickButton = findViewById<Button>(R.id.click_button)
        val clicks = findViewById<TextView>(R.id.clicks)
        clicks.text = clickCount.toString()

        val accountSwitcher = findViewById<EditText>(R.id.accountSwitcher)
        var currentAccount = PreferenceManager.getDefaultSharedPreferences(applicationContext).getString("account", "")
        var string = ""

        val textWatcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if (accountSwitcher.text.toString() == "amgus1") {
                    string = "amgus1"
                }
//                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit().putString("account", string).apply()
            }
            override fun afterTextChanged(s: Editable?) {}
        }

        clickButton.setOnClickListener {
            clickCount++
            clicks.text = clickCount.toString()
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit().putInt("clickCount", clickCount).apply()
        }
    }

    fun AccountSwitcher(name : String) {
        PlayerList.add(name)
    }
}