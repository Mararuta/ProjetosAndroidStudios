package com.generation.jetpackroom.data

import androidx.lifecycle.LiveData
import com.generation.jetpackroom.model.User

class UserRepository (private val  userDao : UserDao) {

    val   lerTodosOsDados : LiveData<List<User>> =  userDao.lerTodososDados()

    fun addUser(user: User){
        userDao.addUser(user)
}
}