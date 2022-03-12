package com.prajwalmreddy.neevhackathon

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.jsoup.Jsoup


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://en.wikipedia.org/wiki/Tropical_cyclone"

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val textview: TextView = findViewById(R.id.textView)

            val thread = Thread {
                try {
                    val document = Jsoup.connect(url).get()
                    textview.text = document.title()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }

            thread.start()
        }
    }
}