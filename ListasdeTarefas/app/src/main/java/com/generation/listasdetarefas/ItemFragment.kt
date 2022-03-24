package com.generation.listasdetarefas

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.generation.listasdetarefas.adaptar.TarefaAdapter
import com.generation.listasdetarefas.model.listaFragment.Tarefa


class ItemFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item_, container, false)
        val listtarefas = mutableListOf(
            Tarefa(
                "Kaio",
                "Cozinhar",
                "Chef",
                "2022-22-06","Culinária",
                true
            )
        )

        val recyclertarefa = view.findViewById<RecyclerView>(R.id.recyclerTarefa)
        val TarefaAdapter = TarefaAdapter()

        recyclertarefa.layoutManager = LinearLayoutManager(context)
        recyclertarefa.adapter = TarefaAdapter
        recyclertarefa.setHasFixedSize(true)
        TarefaAdapter.setLista(listtarefas)
        return view
    }
}