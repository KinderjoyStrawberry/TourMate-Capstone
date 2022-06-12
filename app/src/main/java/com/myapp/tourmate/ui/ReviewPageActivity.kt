package com.myapp.tourmate.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.myapp.tourmate.databinding.ActivityReviewPageBinding

class ReviewPageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReviewPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReviewPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val getExtraDestiname = intent.getStringExtra(DetailPlaceActivity.EXTRA_DESTINAME_PLACE)
        val getExtraImg = intent.getStringExtra(DetailPlaceActivity.EXTRA_IMG_PLACE)

        binding.imgreview.let {
            val option: RequestOptions = RequestOptions.centerCropTransform()
            Glide.with(baseContext)
                .asBitmap()
                .apply(option)
                .load(getExtraImg)
                .into(it) }
        binding.destiname.text = getExtraDestiname.toString()
        binding.btnFeedback.setOnClickListener { btGivereview(getExtraDestiname.toString(),getExtraImg.toString()) }
        Log.d("DESTINAME",getExtraDestiname.toString())
        Log.d("IMG",getExtraImg.toString())
    }

    private fun btGivereview(destiname:String,img:String) {
        Intent(this@ReviewPageActivity, DetailPlaceActivity::class.java).also {
            it.putExtra(DetailPlaceActivity.EXTRA_DESTINAME_PLACE,destiname)
            it.putExtra(DetailPlaceActivity.EXTRA_IMG_PLACE,img)
            startActivity(it)
        }
    }
}