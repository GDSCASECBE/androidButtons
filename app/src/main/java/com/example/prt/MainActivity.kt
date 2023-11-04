package com.example.prt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val eduBtn = findViewById<Button>(R.id.button)
        val about = findViewById<Button>(R.id.button2)
        val cobtn = findViewById<Button>(R.id.button)

        eduBtn.setOnClickListener{
            intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}