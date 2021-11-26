package com.example.amgus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class AmongusActivity : AppCompatActivity() {
    var data = List(Int.MAX_VALUE) {
        "амогусик ${it + 1}"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amongus)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            data
        )
    }
}