package com.generation.sql_com_room

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.sql_com_room.adapter.UserAdapter
import com.generation.sql_com_room.databinding.FragmentListBinding


class ListFragment : Fragment() {
    private lateinit var mainViewModel: MainViewModel
    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(
            layoutInflater, container, false
        )

        mainViewModel = MainViewModel(context)
        val adapter = UserAdapter()

        binding.recyclerUser.layoutManager = LinearLayoutManager(context)
        binding.recyclerUser.adapter = adapter
        binding.recyclerUser.setHasFixedSize(true)

        mainViewModel.lerTodosOsDados.observe(viewLifecycleOwner){
                response -> adapter.setList(response)
        }

        binding.floatingAdd.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_addFragment   )
        }

        return binding.root
    }

}