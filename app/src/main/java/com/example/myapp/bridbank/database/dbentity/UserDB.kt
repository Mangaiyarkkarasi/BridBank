package com.example.myapp.bridbank.database.dbentity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

const val CURRENT_USER_ID = 0

@Entity
data class UserDB(
        var email: String? = null,
        var password: String? = null
) {
    @PrimaryKey(autoGenerate = false)
    var uid: Int = CURRENT_USER_ID

}