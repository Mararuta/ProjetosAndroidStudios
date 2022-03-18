package com.generation.dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Dado6Activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dado6)

        val buttonRolar6 = findViewById<Button>(R.id.buttonRolar6)
        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        buttonRolar6.setOnClickListener {
            Toast.makeText(this, "Dado jogado!", Toast.LENGTH_SHORT).show()
            rolarDados(6)
        }

        buttonVoltar.setOnClickListener {
            finish()
        }
    }

    fun rolarDados(lados: Int) {

        val valor = (1..lados).random()

        val textResult6 = findViewById<TextView>(R.id.textResult6)
        textResult6.text = valor.toString()

        val imageResource = imgDado(valor)

        val imageDado6 = findViewById<ImageView>(R.id.imageDado6)


        imageDado6.setImageResource(imageResource)
    }

    private fun imgDado(valor: Int): Int {

        val textResultDado6 = findViewById<TextView>(R.id.textResultDado6)
        textResultDado6.text = valor.toString()

        return R.drawable.dado

    }

}