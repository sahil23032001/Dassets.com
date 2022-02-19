package com.example.dassets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        val agree= findViewById<Button>(R.id.button2)
        agree.setOnClickListener {
            startActivity(Intent(applicationContext, Phone::class.java))
            finish()
        }
    }
}