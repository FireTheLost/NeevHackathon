package com.prajwalmreddy.neevhackathon

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            var response = ""

            val thread = thread {
                var response: String = Searcher().doInBackground("http://192.168.1.13:5000")
            }

            thread.run()
            textview.text = response
        }
    }
}