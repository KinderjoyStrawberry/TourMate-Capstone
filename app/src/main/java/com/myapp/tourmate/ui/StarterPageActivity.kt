package com.myapp.tourmate.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.tourmate.R
import com.myapp.tourmate.databinding.ActivityStarterPageBinding

class StarterPageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStarterPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStarterPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener { btNext() }
    }

    private fun btNext() {
        Intent(this@StarterPageActivity, LoginActivity::class.java).also {
            it.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(it)
        }
    }
}