package com.generation.todo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.generation.adapterlist.R
import com.generation.todo.adapter.TarefaAdapter
import com.generation.todo.model.Tarefa

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      val view = inflater.inflate(R.layout.fragment_list, container, false)

      val listTarefas = mutableListOf(
            Tarefa(
                "Limpar a Casa",
                "Começar as 9:00AM :>|",
                "Marcelo",
                "21-03-2021",
                true,
                "Dia a Dia"
            ), Tarefa(
                "Estudar",
                "Do dia todo :>(",
                "Marcelo",
                "21-03-2021",
                false,
                "Dia a Dia"
            ),  Tarefa(
                "Ir ao Cinema",
                "Econtrar a galera no shopping :>)",
                "Marcelo",
                "25-06-2021",
                false,
                "Lazer"
            )
        )

        val recyclerTarefa = view.findViewById<RecyclerView>(R.id.recyclerTarefa)

        val adapter = TarefaAdapter()

        recyclerTarefa.layoutManager = LinearLayoutManager(context)

        recyclerTarefa.adapter = adapter

        recyclerTarefa.setHasFixedSize(true)

        adapter.setLista(listTarefas)

        return view
    }

}