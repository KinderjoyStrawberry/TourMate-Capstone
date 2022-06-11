package com.myapp.tourmate.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapp.tourmate.R
import com.myapp.tourmate.databinding.ActivityGiveReviewBinding
import com.myapp.tourmate.databinding.ActivityReviewPageBinding

class ReviewPageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReviewPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReviewPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnFeedback.setOnClickListener { btGivereview() }
    }

    private fun btGivereview() {
        Intent(this@ReviewPageActivity, GiveReviewActivity::class.java).also {
            startActivity(it)
        }
    }
}