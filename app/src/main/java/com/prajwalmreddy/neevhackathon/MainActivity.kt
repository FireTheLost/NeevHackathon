package com.prajwalmreddy.neevhackathon

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://en.wikipedia.org/wiki/Tropical_cyclone"

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val results = Scraper.scrape(url)

            val textview: TextView = findViewById(R.id.textView)
            textview.text = results[0]
        }
    }
}