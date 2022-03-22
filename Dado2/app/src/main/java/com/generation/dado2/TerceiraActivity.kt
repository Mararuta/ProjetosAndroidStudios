package com.generation.dado2


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class TerceiraActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira)

        val button20 = findViewById<Button>(R.id.button20)
        val buttonvolt =findViewById<Button>(R.id.buttonVoltar)

        button20.setOnClickListener { rolardados(20) }
        buttonvolt.setOnClickListener { finish() }

    }
    fun rolardados(lados:Int){
        val valor = (1..lados).random()
        val textResultado = findViewById<TextView>(R.id.textResultado3)
        textResultado.text = valor.toString()
    }
}

