package com.myapp.tourmate.network.apiconnect

import androidx.viewbinding.BuildConfig
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
//    @Headers("Authorization: token ${BuildConfig.GITHUB_TOKEN}")
//    @GET("search/users")
//    fun getUsers(
//        @Query("q") username: String
//    ): Call<Search>
//
//    @Headers("Authorization: token ${BuildConfig.GITHUB_TOKEN}")
//    @GET("users/{username}")
//    suspend fun getUserDetail(
//        @Path("username") username: String
//    ): SearchDetail
//
//    @Headers("Authorization: token ${BuildConfig.GITHUB_TOKEN}")
//    @GET("users/{username}/followers")
//    fun getFollowers(
//        @Path("username") username: String?
//    ): Call<List<ItemsItem>>
//
//    @Headers("Authorization: token ${BuildConfig.GITHUB_TOKEN}")
//    @GET("users/{username}/following")
//    fun getFollowing(
//        @Path("username") username: String?
//    ): Call<List<ItemsItem>>
}