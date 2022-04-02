package com.generation.sql_com_room.data

import androidx.lifecycle.LiveData

class UserRepository (private val userDao: UserDao) {

    val lerTodoOsDados: LiveData<List<User>> = userDao.lerTodosOsDados()

    fun addUser(user: User){
        userDao.addUser(user)
    }
}