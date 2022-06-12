package com.myapp.tourmate.viewmodels

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.myapp.tourmate.network.apiconnect.ApiConfig
import com.myapp.tourmate.network.response.RecomendResponse
import com.myapp.tourmate.network.response.TourItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PopulerActivityViewModel : ViewModel() {
    val listTourItem = MutableLiveData<ArrayList<TourItem>>()

    fun setListPopulerItem(context: Context) {
        ApiConfig.getApiService()
            .getRecommeded()
            .enqueue(object : Callback<RecomendResponse>{
                override fun onResponse(
                    call: Call<RecomendResponse>,
                    response: Response<RecomendResponse>,
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

                override fun onFailure(call: Call<RecomendResponse>, t: Throwable) {
                    Toast.makeText(context, t.message, Toast.LENGTH_SHORT)
                        .show()
                }

            })
    }

    fun getListPopulerItem():LiveData<ArrayList<TourItem>>{
        return listTourItem
    }
}