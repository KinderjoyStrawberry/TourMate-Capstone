package com.myapp.tourmate.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.tourmate.R
import com.myapp.tourmate.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btLogin.setOnClickListener { btLogin() }
        binding.btRegister.setOnClickListener { btRegister() }
    }

    private fun btRegister() {
        Intent(this@LoginActivity, RegisterActivity::class.java).also {
            startActivity(it)
        }
    }

    private fun btLogin() {
        Intent(this@LoginActivity, MainHostActivity::class.java).also {
            it.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(it)
        }
    }
}