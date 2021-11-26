package com.example.amgus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.azeesoft.lib.colorpicker.ColorPickerDialog

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val amogusButton = findViewById<Button>(R.id.amogus_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        greenButton.setOnClickListener {
            val colorPickerDialog = ColorPickerDialog.createColorPickerDialog(this)
            colorPickerDialog.setOnColorPickedListener { color, _ ->
                val intent = Intent(this, ColorActivity::class.java)
                intent.putExtra("color", color)
                startActivity(intent)
            }
            colorPickerDialog.show()
        }
        amogusButton.setOnClickListener {
            val intent = Intent(this, AmongusActivity::class.java)
            startActivity(intent)
        }
    }
}