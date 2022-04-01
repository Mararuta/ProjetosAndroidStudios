package com.generation.jetpackroom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.generation.jetpackroom.databinding.FragmentAddBinding


class AddFragment : Fragment() {
   private lateinit var binding : FragmentAddBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddBinding.inflate(
            layoutInflater, container,false
        )
        return binding.root
    }

        fun validar(nome: String, sobrenome: String, idade: String): Boolean{
            !(nome.isEmpty() || sobrenome.isEmpty() || idade.isEmpty())

        fun inserirNoBanco(){
            val nome = binding.editNome.text
            val sobrenome = binding.editSobreNome.text
            val idade = binding.editIdade.text
        }
    }
}