package com.myapp.tourmate.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.myapp.tourmate.R
import com.myapp.tourmate.databinding.ActivityDetailPlaceBinding
import com.myapp.tourmate.network.response.TourItem

class DetailPlaceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailPlaceBinding
    private lateinit var tourItemData: TourItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailPlaceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

//        val getExtraDesc = intent.getStringExtra(EXTRA_DESC_PLACE)
//        val getExtraDestiname = intent.getStringExtra(EXTRA_DESTINAME_PLACE)
//        val getExtraImg = intent.getStringExtra(EXTRA_IMG_PLACE)
        tourItemData = intent.getParcelableExtra<TourItem>(EXTRA_DATA_PARCEL) as TourItem

//        initGetDataFromHome(getExtraDesc.toString(),
//            getExtraDestiname.toString(),
//            getExtraImg.toString())
        initGetDataFromAPI()
        binding.textReview.setOnClickListener { btReview() }
    }

//    private fun initGetDataFromHome(desc: String, destiname: String, img: String) {
//        binding.detailImg.let {
//            val option: RequestOptions = RequestOptions.centerCropTransform()
//            Glide.with(baseContext)
//                .asBitmap()
//                .apply(option)
//                .load(img)
//                .into(it)
//        }
//        binding.descdtl.text = desc
//        binding.destiname.text = destiname
//    }

    private fun initGetDataFromAPI() {
        binding.apply {
            detailImg.let {
                val option: RequestOptions = RequestOptions.centerCropTransform()
                Glide.with(baseContext)
                    .asBitmap()
                    .apply(option)
                    .load(tourItemData?.img_url)
                    .into(it)
            }
            rating.text = tourItemData?.Rating
            descdtl.text = tourItemData?.Description
            destiname.text = tourItemData?.Place_Name
        }
    }

    private fun btReview() {
        Intent(this@DetailPlaceActivity, ReviewPageActivity::class.java).also {
            startActivity(it)
        }
    }

    companion object {
        const val EXTRA_DESC_PLACE = "extra_desc_place"
        const val EXTRA_DESTINAME_PLACE = "extra_destiname_place"
        const val EXTRA_IMG_PLACE = "extra_img_place"
        const val EXTRA_DATA_PARCEL = "extra_data_parcel"
    }
}