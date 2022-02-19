package com.example.dassets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val stock= findViewById<Button>(R.id.button5)
        val currencies = findViewById<Button>(R.id.button4)

        currencies.setOnClickListener {
            startActivity(Intent(applicationContext, Crypto::class.java))
            finish()
        }


        stock.setOnClickListener {
            startActivity(Intent(applicationContext, Stocks::class.java))
            finish()
        }


    }
}