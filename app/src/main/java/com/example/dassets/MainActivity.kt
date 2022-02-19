package com.example.dassets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val begin= findViewById<Button>(R.id.button)
        begin.setOnClickListener {
            startActivity(Intent(applicationContext, info::class.java))
            finish()
        }

    }
}