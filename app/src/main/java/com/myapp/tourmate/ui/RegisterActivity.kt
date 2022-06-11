package com.myapp.tourmate.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.tourmate.R
import com.myapp.tourmate.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btRegister.setOnClickListener { btRegister() }
    }

    private fun btRegister() {
        Intent(this@RegisterActivity, LoginActivity::class.java).also {
            it.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(it)
        }
    }
}