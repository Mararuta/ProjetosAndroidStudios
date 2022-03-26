package com.tarsilanascmartins.recycleratividade.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tarsilanascmartins.recycleratividade.R
import com.tarsilanascmartins.recycleratividade.modelo.Tarefas

class TarefaAdapter: RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {


    private var listTarefas = emptyList<Tarefas>()

    class TarefaViewHolder (view: View): RecyclerView.ViewHolder(view) {
        val textTop = view.findViewById<TextView>(R.id.textTop)
        val textDescricao = view.findViewById<TextView>(R.id.textDescricao)
        val textResponsavel = view.findViewById<TextView>(R.id.textResponsavel)
        val textData = view.findViewById<TextView>(R.id.textData)
        val spinnerCategoria = view.findViewById<TextView>(R.id.spinnerCategoria)
        val switchAndamento = view.findViewById<Switch>(R.id.switchAndamento)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_layout, parent,false)

        return TarefaViewHolder(layout)
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefas = listTarefas [position]

        holder.textTop.text = tarefas.nome
        holder.textDescricao.text = tarefas.descricao
        holder.textResponsavel.text = tarefas.responsavel
        holder.textData.text = tarefas.data
        holder.spinnerCategoria.text= tarefas.categoria
        holder.switchAndamento.isChecked = tarefas.status
    }

    override fun getItemCount(): Int {
        return listTarefas.size

    }

    fun setLista (lista: List<Tarefas>){
        listTarefas = lista
        notifyDataSetChanged()
    }



}