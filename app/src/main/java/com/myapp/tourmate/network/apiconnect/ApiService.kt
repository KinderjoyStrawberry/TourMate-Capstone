package com.myapp.tourmate.network.apiconnect

import com.myapp.tourmate.network.response.AllPlaceResponse
import com.myapp.tourmate.network.response.RecomendResponse
import com.myapp.tourmate.network.response.TourItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("rekomendasi")
    fun getRecommeded(): Call<RecomendResponse>

    @GET("wisata")
    fun getAllPlace(): Call<AllPlaceResponse<TourItem>>
}