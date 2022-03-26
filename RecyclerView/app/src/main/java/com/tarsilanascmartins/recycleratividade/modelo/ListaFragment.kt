package com.tarsilanascmartins.recycleratividade.modelo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tarsilanascmartins.recycleratividade.R
import com.tarsilanascmartins.recycleratividade.adapter.TarefaAdapter

class ListaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_lista, container, false)

        val listaTarefas = mutableListOf(

            Tarefas (
                "Planejar para sair com os amigos",
                "Verificar um lugar e as datas que têm disponíveis",
                "Tarsila",
                "25/03/2022",
                "Lazer",
                true    ),

            Tarefas (
                "Arrumar a casa",
                "Lavar a louça e o banheiro",
                "Tarsila",
                "24/03/2022",
                "Tarefas Domicílio",
                true    ),

            Tarefas (
                "Estudar Recycle View",
                "Após estudar fazer um resumo e tentar fazer um app",
                "Tarsila",
                "21/03/2022",
                "Estudos",
                true    )

        )

        val recyclerTarefa = view.findViewById<RecyclerView>(R.id.recyclerTarefa)

        val adapter = TarefaAdapter()

        recyclerTarefa.layoutManager = LinearLayoutManager(context)

        recyclerTarefa.adapter = adapter

        recyclerTarefa.setHasFixedSize(true)

        adapter.setLista(listaTarefas)

        return view





    }


}