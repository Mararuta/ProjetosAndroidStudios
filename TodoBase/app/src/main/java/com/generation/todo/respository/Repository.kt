package com.generation.todo.respository

import com.generation.todo.api.Retrofitinstance
import com.generation.todo.model.Categoria
import retrofit2.Response

class Repository {
    suspend fun listCategoria():Response<List<Categoria>>{
        return Retrofitinstance.Api.ListCategoria()
    }
}