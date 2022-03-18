package com.generation.dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Dado12Activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dado6)

        val buttonRolar12 = findViewById<Button>(R.id.buttonRolar12)
        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        buttonRolar12.setOnClickListener {
            Toast.makeText(this, "Dado jogado!", Toast.LENGTH_SHORT).show()
            rolarDados(12)
        }

        buttonVoltar.setOnClickListener {
            finish()
        }
    }

    fun rolarDados(lados: Int) {

        val valor = (1..lados).random()

        val textResult12 = findViewById<TextView>(R.id.textResult12)
        textResult12.text = valor.toString()

        val imageResource = imgDado(valor)

        val imageDado12 = findViewById<ImageView>(R.id.imageDado12)


        imageDado12.setImageResource(imageResource)
    }

    private fun imgDado(valor: Int): Int {

        val textResultDado12 = findViewById<TextView>(R.id.textResultDado12)
        textResultDado12.text = valor.toString()

        return R.drawable.dado

    }

}