package com.example.myapp.bridbank.repositories

import com.example.myapp.bridbank.database.dbentity.AppDatabase
import com.example.myapp.bridbank.database.dbentity.UserDB

class UserDataRepository(    private val db: AppDatabase
) {

     fun saveUser(user: UserDB) = db.userDao().insert(user)

    fun getUser() = db.userDao().getuser()
}