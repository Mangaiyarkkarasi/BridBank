package com.example.myapp.bridbank.auth.viewmodel

import android.arch.lifecycle.ViewModel
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import com.example.myapp.bridbank.Interface.LoginResultCallbacks
import com.example.myapp.bridbank.data.User
import com.example.myapp.bridbank.database.dbentity.UserDB
import com.example.myapp.bridbank.repositories.UserDataRepository

class LoginViewModel(listener: LoginResultCallbacks) :ViewModel() {
    private val user: User
    private val repository: UserDataRepository? = null

    init {
        this.user = User("", "")
    }

    //Write method to get Email from EditText and set to user
    val emailTextWatcher: TextWatcher
        get() = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                user.setEmail(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("$$$$$$$$","email")

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        }

    //Write method to get Password from EditText and set to user
    val passwordTextWatcher: TextWatcher
        get() = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                Log.d("$$$$$$$$",s.toString())

                user.setPassword(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("$$$$$$$$","pass")

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        }

     fun onLoginClicked(view: View) {
        Log.d("$$$$$$$$",user.getEmail())
        val userDB= UserDB(user.getEmail(),user.getPassword())

        Log.d("$$$$$$$$$",repository?.getUser().toString())
    }
}