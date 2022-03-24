package com.generation.listasdetarefas.adaptar

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import android.widget.TextView
import com.generation.listasdetarefas.R
import com.generation.listasdetarefas.model.listaFragment.Tarefa

    class TarefaAdapter  : RecyclerView.Adapter<TarefaAdapter.TarefaviewHolder>(){

       private var  listTarefas = emptyList<Tarefa>()

    class TarefaviewHolder(view:View):RecyclerView.ViewHolder(view){

        val texNome = view.findViewById<TextView>(R.id.textnome)
        val texDescricao = view.findViewById<TextView>(R.id.textdescricao)
        val textResponsavel = view.findViewById<TextView>(R.id.textresponsavel)
        val textData = view.findViewById<TextView>(R.id.textdata)
        val SwitchAndamento = view.findViewById<Switch>(R.id.SwitchAndamento)
        val categoria = view.findViewById<TextView>(R.id.textcategoria)
        val buttondeletar = view.findViewById<TextView>(R.id.Deletar)

  }

        override fun onCreateViewHolder(parent:ViewGroup,viewType :Int): TarefaviewHolder {
            val  layout = LayoutInflater.from(parent.context)
                .inflate(R.layout.cardlayout,parent,false)
            return TarefaviewHolder(layout)
        }

        override fun onBindViewHolder(holder: TarefaviewHolder, position: Int)  {
                val postagem = listTarefas[position]
            holder.texNome.text = postagem.nome
            holder.texDescricao.text = postagem.descricao
            holder.textResponsavel.text = postagem.responsavel
            holder.textData.text = postagem.data
            holder.SwitchAndamento.isChecked = postagem.SwitchAndamento
            holder.categoria.text = postagem.categoria

        }

        override fun getItemCount(): Int {
            return listTarefas.size
        }
        fun setLista(lista:List<Tarefa>){
            listTarefas = lista
            notifyDataSetChanged()
        }
    }
