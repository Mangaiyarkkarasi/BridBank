package com.example.myapp.bridbank.auth

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapp.bridbank.Interface.LoginResultCallbacks
import com.example.myapp.bridbank.R
import com.example.myapp.bridbank.auth.viewmodel.LoginViewModel
import com.example.myapp.bridbank.auth.viewmodel.LoginViewModelFactory
import com.example.myapp.bridbank.databinding.ActivityLoginBinding
import com.example.myapp.bridbank.repositories.UserDataRepository

class LoginActivity : AppCompatActivity(),LoginResultCallbacks {


    var binding: ActivityLoginBinding?= null
    var viewmodel: LoginViewModel? = null
    private val userRepo: UserDataRepository? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_login)
        binding = DataBindingUtil.setContentView<ActivityLoginBinding>(this, R.layout.activity_login)
        viewmodel = ViewModelProviders.of(this, LoginViewModelFactory(this)).get(LoginViewModel::class.java)
        binding?.viewModel = viewmodel
        // activityMainBinding.viewModel = ViewModelProviders.of(this,
       // LoginViewModelFactory(this)).get(LoginViewModel::class.java)
    }

    override fun onSuccess(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
