package com.example.amgus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class AmongusActivity : AppCompatActivity() {
    var count = 0
    var data = MutableList(100000) {
        count
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
        listView.setOnItemClickListener { parent, view, position, id ->
            var element = data
            var result = data[position]
            var int = result
            element[position] = int + 1
        }

    }
}