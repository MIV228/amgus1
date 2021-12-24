package com.example.amgus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class LifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("LIFECYCLE", "onCreate()")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)
    }
    override fun onStart() {
        Log.d("LIFECYCLE", "onStart()")
        super.onStart()
    }
    override fun onResume() {
        Log.d("LIFECYCLE", "onResume()")
        super.onResume()
    }
    override fun onPause() {
        Log.d("LIFECYCLE", "onPause()")
        super.onPause()
    }
    override fun onStop() {
        Log.d("LIFECYCLE", "onStop()")
        super.onStop()
    }
    override fun onDestroy() {
        Log.d("LIFECYCLE", "onDestroy()")
        super.onDestroy()
    }
}