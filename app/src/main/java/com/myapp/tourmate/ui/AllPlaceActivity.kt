package com.myapp.tourmate.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.myapp.tourmate.adapter.TourItemAdapter
import com.myapp.tourmate.databinding.ActivityAllPlaceBinding
import com.myapp.tourmate.network.response.TourItem
import com.myapp.tourmate.viewmodels.AllPlaceActivityViewModel

class AllPlaceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAllPlaceBinding
    private lateinit var adapter: TourItemAdapter
    private lateinit var viewModel: AllPlaceActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllPlaceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        initAdapter()
        initViewModel()
        initSetData()
        initRecycleView()
        initGetData()
    }

    private fun initAdapter() {
        adapter = TourItemAdapter()
        adapter.notifyDataSetChanged()
        adapter.setClickItem(object : TourItemAdapter.ClickItem {
            override fun onItemClicked(tourItem: TourItem) {
                Intent(this@AllPlaceActivity, DetailPlaceActivity::class.java).also {
                    it.putExtra(DetailPlaceActivity.EXTRA_DATA_PARCEL, tourItem)
                    startActivity(it)
                }
            }
        })
    }


    private fun initRecycleView() {
        binding.apply {
            rvAllPlace.layoutManager = LinearLayoutManager(this@AllPlaceActivity)
            rvAllPlace.setHasFixedSize(true)
            rvAllPlace.adapter = adapter
        }
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
            AllPlaceActivityViewModel::class.java)
    }

    private fun initSetData() {
        viewModel.setListAllPlaceItem(this@AllPlaceActivity)
    }

    private fun initGetData() {
        viewModel.getListAllPlaceItem().observe(this) {
            if (it != null) {
                adapter.setListTourItem(it)
            }
        }
    }
}