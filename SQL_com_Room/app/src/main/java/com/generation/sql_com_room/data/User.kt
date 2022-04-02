package com.generation.sql_com_room.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
class User(
    @PrimaryKey
    val id: Long,
    var nome: String,
    var sobrenome: String,
    var idade: Int
) {
}