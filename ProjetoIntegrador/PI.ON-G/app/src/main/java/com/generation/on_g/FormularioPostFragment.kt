package com.generation.on_g

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.navigation.fragment.findNavController
import com.generation.on_g.databinding.ActivityMainBinding
import com.generation.on_g.databinding.ActivityMainBinding.inflate
import com.generation.on_g.databinding.FragmentFormularioPostBinding
import com.generation.on_g.databinding.FragmentPostagemBinding

class FormularioPostFragment : Fragment() {

    private lateinit var binding: FragmentFormularioPostBinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormularioPostBinding.inflate(layoutInflater, container, false)

        /*
        val view = inflater.inflate(R.layout.fragment_formulario_post, container, false)
        val buttonPublicar = view.findViewById<Button>(R.id.buttonPublicar)

         */


        binding.buttonPublicar.setOnClickListener {
            val titulo = binding.editTitulo.text
            val locali = binding.editTitulo.text

            if((titulo.isEmpty() || locali.isEmpty())){
                makeText(context, "Preencha os campos obrigatórios", Toast.LENGTH_LONG).show()

            }else {
                findNavController().navigate(R.id.action_formularioPostFragment_to_postagemFragment)

            }

        }
        return binding.root
    }
}

