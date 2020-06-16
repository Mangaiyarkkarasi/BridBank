package com.example.myapp.bridbank.Interface

interface LoginResultCallbacks {
    fun onSuccess(message: String)
    fun onError(message: String)
}