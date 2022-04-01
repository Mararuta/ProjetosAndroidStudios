package com.generation.sqlcomroom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.sqlcomroom.data.User
import com.generation.sqlcomroom.databinding.FragmentAddBinding

class AddFragment : Fragment() {
    private lateinit var mainViewModel: UserViewModel
    private lateinit var binding: FragmentAddBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddBinding.inflate(
            layoutInflater, container, false
        )
         mainViewModel = UserViewModel(context)

        binding.buttonCadastrar.setOnClickListener {
            inserirBanco()
        }

        return binding.root
    }

    fun validar(nome: String, sobrenome: String, idade: String): Boolean{
        return !(nome.isEmpty() || sobrenome.isEmpty() || idade.isEmpty())
    }

    fun inserirBanco(){

        val nome = binding.editNome.text.toString()
        val sobrenome = binding.editSobreNome.text.toString()
        val idade = binding.editTextNumber.text.toString()

        if(validar(nome, sobrenome, idade)){
            val user = User(0, nome, sobrenome, idade.toInt())
            mainViewModel.addUser(user)
            Toast.makeText(
                context,"Usuários Cadastrado", Toast.LENGTH_SHORT
            ).show()
            findNavController().navigate((R.id.action_listFragment_to_addFragment))
        }
    }
}