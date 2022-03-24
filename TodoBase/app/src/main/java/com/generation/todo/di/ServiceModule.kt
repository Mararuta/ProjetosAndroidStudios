package com.generation.todo.di

import com.generation.todo.respository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// o objeto que guarda as intancias que serão criadas

@Module // indica que o objeto guardará os modulos
@InstallIn (SingletonComponent::class) //indica que a classe criara objetos singleton
object ServiceModule {

    @Provides // Indicar que o métodos que criaremos rertonará uma instancia de objeto
    @Singleton // indicando o objeto que estamos criando vai ser Singleton
    fun providesRepository () : Repository {
        return Repository()
    }
}