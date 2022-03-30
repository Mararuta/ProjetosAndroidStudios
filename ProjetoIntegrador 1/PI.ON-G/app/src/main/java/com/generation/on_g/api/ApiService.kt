package com.generation.on_g.api

import com.generation.on_g.modelo.Categoria
import com.generation.on_g.modelo.Postagem
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    //Requisição das categorias - Lista de categorias
    @GET("categoria")
    suspend fun listCategoria (): Response<List<Categoria>>
    //Adicionar Tarefa
    @POST
    suspend fun addPostagem(
        @Body tarefa: Postagem
    ): Response<Postagem>

    //Requisições das Postagens
    @GET("postagem")
    suspend fun postagem(): Response<List<Postagem>>
}