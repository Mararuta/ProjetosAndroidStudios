package com.tarsilanascmartins.recycleratividade.modelo

data class Tarefas(
    var nome:String,
    var descricao : String,
    var responsavel:String,
    var data :String,
    var categoria : String,
    var status : Boolean
) {
}