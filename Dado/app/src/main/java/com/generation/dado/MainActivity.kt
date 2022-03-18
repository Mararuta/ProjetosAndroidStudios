package com.generation.dado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDado6 = findViewById<Button>(R.id.buttonRolar6)
        val intentDado6 = Intent(this, Dado6Activity::class.java)

        buttonDado6.setOnClickListener {
            startActivity(intentDado6)
        }

        val buttonDado12 = findViewById<Button>(R.id.buttonRolar12)
        val intentDado12 = Intent(this, Dado12Activity::class.java)

        buttonDado12.setOnClickListener {
            startActivity(intentDado12)
        }

        val buttonDado20 = findViewById<Button>(R.id.buttonRolar20)
        val intentDado20 = Intent(this, Dado20Activity::class.java)

        buttonDado20.setOnClickListener {
            startActivity(intentDado20)
        }
    }
}


