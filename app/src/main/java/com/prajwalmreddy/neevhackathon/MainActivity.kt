package com.prajwalmreddy.neevhackathon

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input: TextView = findViewById(R.id.editTextTextPersonName)
        val textview: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            textview.text = "Searching For Information About '${input.text}'..."
        }
    }
}