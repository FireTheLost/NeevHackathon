package com.prajwalmreddy.neevhackathon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)

        val randomStrings: Array<String> = arrayOf("Hello There", "'Sup", "Testing", "Checking")

        button.setOnClickListener {
            val toast = Toast.makeText(this, randomStrings.random(), Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}