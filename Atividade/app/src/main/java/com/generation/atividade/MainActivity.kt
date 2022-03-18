package com.generation.atividade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criamos uma referência do buttonSalvar
        val buttonSalvar = findViewById<Button>(R.id.buttonSalvar)

        /*
        Listener de clique - Vai ficar verificando o momento que o usuário clicar no botão
        Definir oque vai acontecer no momento do clique
        */

        buttonSalvar.setOnClickListener {
            //Toast.makeText(this, "Clicamos no botão", Toast.LENGTH_SHORT).show()

        }

    }

}