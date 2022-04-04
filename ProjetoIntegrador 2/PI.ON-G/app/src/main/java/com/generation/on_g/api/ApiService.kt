package com.generation.on_g.api

import com.generation.on_g.modelo.Categoria
import com.generation.on_g.modelo.Postagem
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface ApiService {
    //Requisição das categorias - Lista de categorias
    @GET("temas")
    suspend fun listCategoria (): Response<List<Categoria>>
    //Adicionar Tarefa

    @POST ("postagens")
    suspend fun addPostagem(
        @Body postagem: Postagem
    ): Response<Postagem>

    @PUT ("postagens")
    suspend fun updatePostagem(
        @Body postagem: Postagem
    ): Response<Postagem>

    //Requisições das Postagens
    @GET("postagens")
    suspend fun postagem(): Response<List<Postagem>>
}