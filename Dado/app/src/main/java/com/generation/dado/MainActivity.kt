package com.generation.dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        val button2 = findViewById<Button>(R.id.button2)

        val button3 = findViewById<Button>(R.id.button3)



        button.setOnClickListener {
        rolardados(6)
        }

        button2.setOnClickListener {
            rolardados(12)
        }

        button3.setOnClickListener {
            rolardados(20)
        }


     }
         fun rolardados(lados:Int){
        val valor = (1..lados).random()
        val textresultado = findViewById<TextView>(R.id.Text)

        textresultado.text = valor.toString()

             val imageResource = imgD6(valor)

             val imageDado = findViewById< ImageView >( R .id.imgDado)

             imageDado.setImageResource(imageResource)

         }

    private fun imgD6(valor: Int): Int {
        return when(valor){
            1 -> R.drawable.face1
            2 -> R.drawable.face2
            3 -> R.drawable.face_3
            4 -> R.drawable.face_4
            5 -> R.drawable.face_5
            6 -> R.drawable.face_6
            12 -> R.drawable.face_12
            else -> R.drawable.face_20
        }
    }

}