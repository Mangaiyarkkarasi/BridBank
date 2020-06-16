package com.example.myapp.bridbank.auth.viewmodel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.myapp.bridbank.Interface.LoginResultCallbacks
import com.example.myapp.bridbank.repositories.UserDataRepository

class LoginViewModelFactory(private val listener:LoginResultCallbacks) :ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginViewModel(listener) as T
    }
}