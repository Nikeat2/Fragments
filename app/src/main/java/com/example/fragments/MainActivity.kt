package com.example.fragments

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image: ImageView = findViewById(R.id.picture)
        val clickMe: Button = findViewById(R.id.ClickMe)
        val firstPageText: TextView = findViewById(R.id.first_page_text)

        clickMe.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)


        }

    }
}