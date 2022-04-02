package com.generation.sql_com_room

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.sql_com_room.data.User
import com.generation.sql_com_room.data.UserDatabase
import com.generation.sql_com_room.data.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(context: Context?): ViewModel() {

    val lerTodosOsDados: LiveData<List<User>>
    private val repository: UserRepository

    init{
        val userDao = UserDatabase.getDatabase(context!!).useDao()
        repository = UserRepository(userDao)
        lerTodosOsDados = repository.lerTodoOsDados
    }

    fun addUser(user: User){
        viewModelScope.launch (Dispatchers.IO){
            repository.addUser(user)

        }
    }
}