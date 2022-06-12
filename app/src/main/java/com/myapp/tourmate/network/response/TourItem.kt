package com.myapp.tourmate.network.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TourItem(
    val Category: String? = null,
    val City: String? = null,
    val Cordinate: String? = null,
    val Description: String? = null,
    val Lat: Float? = null,
    val Long: Float? = null,
    val Maps: String? = null,
    val Place_Id: String,
    val Place_Name: String? = null,
    val Price: String? = null,
    val Rating: String? = null,
    val img_url: String? = null
): Parcelable
