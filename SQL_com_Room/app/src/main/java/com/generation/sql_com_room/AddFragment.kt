package com.generation.sql_com_room

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.generation.sql_com_room.data.User
import com.generation.sql_com_room.databinding.FragmentAddBinding
import com.generation.sql_com_room.databinding.FragmentListBinding


class AddFragment : Fragment() {
    private lateinit var mainViewModel: MainViewModel
    private lateinit var binding: FragmentAddBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddBinding.inflate(
            layoutInflater,container, false
        )

        mainViewModel = MainViewModel(context)

        binding.buttonCadastrar.setOnClickListener {
            inserirBanco()
        }

        return binding.root
    }

    fun validar(nome: String, sobrenome: String, idade: String):Boolean{
        return !(nome.isEmpty() || sobrenome.isEmpty() || idade.isEmpty())
    }

    fun inserirBanco(){

        val nome = binding.editNome.text.toString()
        val sobrenome = binding.editSobrenome.text.toString()
        val idade = binding.editIdade.text.toString()

        if(validar(nome, sobrenome, idade)){
            val user = User(0, nome, sobrenome, idade.toInt())
            mainViewModel.addUser(user)
            Toast.makeText(
                context, "Usuário Cadastrado", Toast.LENGTH_SHORT
            ).show()
            findNavController().navigate(R.id.action_addFragment_to_listFragment)
        } else {
            Toast.makeText(context, "Preencha os campos corretamente!", Toast.LENGTH_LONG).show()
        }

    }

}