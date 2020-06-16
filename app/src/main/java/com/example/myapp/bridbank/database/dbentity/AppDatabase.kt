package com.example.myapp.bridbank.database.dbentity

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.example.myapp.bridbank.database.dbentity.dao.UserDao


@Database(
        entities = [UserDB::class],
        version = 1
)

abstract class AppDatabase :RoomDatabase(){
    abstract fun userDao(): UserDao

    companion object {
        private var instance: AppDatabase? = null
        fun getAppDataBase(context: Context): AppDatabase? {
            if (instance == null){
                synchronized(AppDatabase::class){
                    instance = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "myDB").build()
                }
            }
            return instance
        }

        fun destroyDataBase(){
            instance = null
        }
    }

    }