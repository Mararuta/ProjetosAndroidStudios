package com.generation.jetpackroom.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.generation.jetpackroom.model.User

@Dao
interface UserDao {
    //(Inserir)
    //@Insert  - Inseri um dado dentro do banco de dados
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addUser (user : User)

    //(Listar)
    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun lerTodososDados ():LiveData<List<User>>

}