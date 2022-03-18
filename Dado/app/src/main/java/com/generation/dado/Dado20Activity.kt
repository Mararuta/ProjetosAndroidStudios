package com.generation.dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Dado20Activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dado6)

        val buttonRolar20 = findViewById<Button>(R.id.buttonRolar20)
        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        buttonRolar20.setOnClickListener {
            Toast.makeText(this, "Dado jogado!", Toast.LENGTH_SHORT).show()
            rolarDados(12)
        }

        buttonVoltar.setOnClickListener {
            finish()
        }
    }

    fun rolarDados(lados: Int) {

        val valor = (1..lados).random()

        val textResult20 = findViewById<TextView>(R.id.textResult20)
        textResult20.text = valor.toString()

        val imageResource = imgDado(valor)

        val imageDado20 = findViewById<ImageView>(R.id.imageDado20)


        imageDado20.setImageResource(imageResource)
    }

    private fun imgDado(valor: Int): Int {

        val textResultDado20 = findViewById<TextView>(R.id.textResultDado20)
        textResultDado20.text = valor.toString()

        return R.drawable.dado

    }

}