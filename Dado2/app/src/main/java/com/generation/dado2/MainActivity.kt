package com.generation.dado2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        val buttonD20 = findViewById<Button>(R.id.buttonD20)


        val intentSegunda = Intent(this,SegundaActivity::class.java)
        val intentTerceira = Intent(this,TerceiraActivity::class.java)

        buttonD6.setOnClickListener {
           rolardados(6)
        }
        buttonD12.setOnClickListener {
            startActivity(intentSegunda)
        }

        buttonD20.setOnClickListener {
           startActivity(intentTerceira)
        }


    }

         fun rolardados(lados:Int){
        val valor = (1..lados).random()
        val textResultado = findViewById<TextView>(R.id.textResultado1)
        textResultado.text = valor.toString()

    }


}