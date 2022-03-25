package com.generation.todo.mainviewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.todo.model.Categoria
import com.generation.todo.respository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import java.lang.Exception
import java.time.LocalDate
import javax.inject.Inject

@HiltViewModel // Indica que a nossa viewModel vai Injetar Dependências
//@Inject -> para saber o que vai injetar ([contrutor] nesse caso.)
class MainViewModel @Inject constructor(
    val repository:Repository
    ): ViewModel () {
        private val _responseListCategoria =
            MutableLiveData<Response<List<Categoria>>>()

    val responseListCategoria: LiveData<Response<List<Categoria>>> =
        _responseListCategoria


    val dataSelecionada = MutableLiveData<LocalDate>()

    init {
        dataSelecionada.value = LocalDate.now()
          listCategoria()
      }
    fun listCategoria(){
        viewModelScope.launch {
                try {
                 val response = repository.listCategoria()
                    _responseListCategoria.value = response
                }catch (e : Exception){
                    Log.d("ErroRequisicao", e.message.toString())
                }
        }
    }
}