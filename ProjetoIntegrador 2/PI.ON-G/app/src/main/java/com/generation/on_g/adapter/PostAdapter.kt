package com.generation.on_g.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.generation.on_g.R
import com.generation.on_g.modelo.Postagem
import com.generation.on_g.mvvm.MainViewModel

class PostAdapter (
    private val taskItemClickListener: TaskItemClickListener,
    private val mainViewModel: MainViewModel
        ): RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    private var ListPost = emptyList<Postagem>()

    class PostViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val textTitulo = view.findViewById<TextView>(R.id.textTitulo)
        val textLocal = view.findViewById<TextView>(R.id.textLocal)
        val imageView = view.findViewById<ImageView>(R.id.imageView)
        val textDescri = view.findViewById<TextView>(R.id.textDescri)
        val textCatego = view.findViewById<TextView>(R.id.textCatego)
        val textAutor = view.findViewById<TextView>(R.id.textAutor)
        val textDaHr = view.findViewById<TextView>(R.id.textDaHr)
        val postButtonEdit = view.findViewById<ImageButton>(R.id.editPost)
        val deleteButton = view.findViewById<ImageButton>(R.id.deleteButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_feed_postagem, parent, false)

        return PostViewHolder(layout)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val postagem =  ListPost[position]

        holder.textTitulo.text  = postagem.titulo
        holder.textDescri.text  = postagem.descricao
        holder.textCatego.text  = postagem.tema.descricao
        holder.textAutor.text  = postagem.autor
        holder.textDaHr.text  = postagem.datahora



      /* holder.itemView.setOnClickListener{
            taskItemClickListener.onTaskClicked(postagem)
        }*/
        holder.postButtonEdit.setOnClickListener{
            taskItemClickListener.onTaskClicked(postagem)
        }
        holder.deleteButton.setOnClickListener{
            mainViewModel.deletePostagem(postagem.id)
        }
    }

    override fun getItemCount(): Int {
        return ListPost.size
    }

    fun attList (Post : List<Postagem>){
        ListPost = Post
        notifyDataSetChanged()
    }
}