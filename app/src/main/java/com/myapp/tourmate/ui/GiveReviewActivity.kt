package com.myapp.tourmate.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.tourmate.R
import com.myapp.tourmate.databinding.ActivityGiveReviewBinding
import com.myapp.tourmate.databinding.ActivityRegisterBinding

class GiveReviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGiveReviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGiveReviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
    }
}