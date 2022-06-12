package com.myapp.tourmate.viewmodels

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.myapp.tourmate.network.apiconnect.ApiConfig
import com.myapp.tourmate.network.response.AllPlaceResponse
import com.myapp.tourmate.network.response.RecomendResponse
import com.myapp.tourmate.network.response.TourItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AllPlaceActivityViewModel: ViewModel() {
    val listTourItem = MutableLiveData<ArrayList<TourItem>>()

    fun setListAllPlaceItem(context: Context) {
        ApiConfig.getApiService()
            .getAllPlace()
            .enqueue(object : Callback<AllPlaceResponse> {
                override fun onResponse(
                    call: Call<AllPlaceResponse>,
                    response: Response<AllPlaceResponse>,
                ) {
                    if (response.isSuccessful){
                        listTourItem.postValue(response.body()?.data)
                        Log.d("DATA ITEM", listTourItem.toString())
                    }
                    else {
                        Toast.makeText(context, response.message(), Toast.LENGTH_SHORT)
                            .show()
                    }
                }

                override fun onFailure(call: Call<AllPlaceResponse>, t: Throwable) {
                    Toast.makeText(context, t.message, Toast.LENGTH_SHORT)
                        .show()
                }

            })
    }

    fun getListAllPlaceItem(): LiveData<ArrayList<TourItem>> {
        return listTourItem
    }
}