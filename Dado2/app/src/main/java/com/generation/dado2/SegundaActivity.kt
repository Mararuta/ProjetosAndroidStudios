package com.generation.dado2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val button2tela = findViewById<Button>(R.id.button2tela)
        val buttonvolt = findViewById<Button>(R.id.buttonVolt)

        button2tela.setOnClickListener{
          rolardados(12)
        }
        buttonvolt.setOnClickListener{
            finish()
        }

    }
    fun rolardados(lados:Int){
        val valor = (1..lados).random()
        val textResultado = findViewById<TextView>(R.id.textResultado2)
        textResultado.text = valor.toString()
    }
}