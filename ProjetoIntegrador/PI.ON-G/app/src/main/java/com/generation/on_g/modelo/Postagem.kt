package com.generation.on_g.modelo

import android.widget.ImageView

data class Postagem(
    val id : Long,
    var titulo : String,
    var descricao : String,
    var localizacao : String,
    var categoria : Categoria,
    //var autor : String,
    //var dataEHora : String
){
}