package com.example.testtutoria

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailView : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_layout)

        val showData: TextView = findViewById<TextView>(R.id.tvShowData)
        showData.setText(intent.getStringExtra("name"))

    }
}