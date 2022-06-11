package com.myapp.tourmate.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.myapp.tourmate.R
import com.myapp.tourmate.databinding.ActivityDetailPlaceBinding

class DetailPlaceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailPlaceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailPlaceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getExtraDesc = intent.getStringExtra(EXTRA_DESC_PLACE)
        val getExtraDestiname = intent.getStringExtra(EXTRA_DESTINAME_PLACE)
        val getExtraImg = intent.getStringExtra(EXTRA_IMG_PLACE)

        binding.detailImg.let {
            val option: RequestOptions = RequestOptions.centerCropTransform()
            Glide.with(baseContext)
                .asBitmap()
                .apply(option)
                .load(getExtraImg)
                .into(it) }
        binding.descdtl.text = getExtraDesc.toString()
        binding.destiname.text = getExtraDestiname.toString()
    }

    companion object {
        const val EXTRA_DESC_PLACE = "extra_desc_place"
        const val EXTRA_DESTINAME_PLACE = "extra_destiname_place"
        const val EXTRA_IMG_PLACE = "extra_img_place"
    }
}