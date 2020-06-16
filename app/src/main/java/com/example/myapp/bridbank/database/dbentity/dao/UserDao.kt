package com.example.myapp.bridbank.database.dbentity.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.example.myapp.bridbank.database.dbentity.CURRENT_USER_ID
import com.example.myapp.bridbank.database.dbentity.UserDB

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insert(user: UserDB) : Long

    @Query("SELECT * FROM UserDB WHERE uid = $CURRENT_USER_ID")
    fun getuser() : LiveData<UserDB>
}