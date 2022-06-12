package com.myapp.tourmate.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.myapp.tourmate.adapter.TourItemAdapter
import com.myapp.tourmate.databinding.ActivityPopulerBinding
import com.myapp.tourmate.network.response.TourItem
import com.myapp.tourmate.viewmodels.PopulerActivityViewModel

class PopulerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPopulerBinding
    private lateinit var adapter: TourItemAdapter
    private lateinit var viewModel: PopulerActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPopulerBinding.inflate(layoutInflater)
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
        adapter.setClickItem(object: TourItemAdapter.ClickItem{
            override fun onItemClicked(tourItem: TourItem) {
                Intent(this@PopulerActivity, DetailPlaceActivity::class.java).also {
                    it.putExtra(DetailPlaceActivity.EXTRA_DATA_PARCEL, tourItem)
                    startActivity(it)
                }
            }
        })
    }

    private fun initRecycleView() {
        binding.apply {
            rvPopuler.layoutManager = LinearLayoutManager(this@PopulerActivity)
            rvPopuler.setHasFixedSize(true)
            rvPopuler.adapter = adapter
        }
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(PopulerActivityViewModel::class.java)
    }

    private fun initSetData() {
        viewModel.setListPopulerItem(this@PopulerActivity)
    }

    private fun initGetData() {
        viewModel.getListPopulerItem().observe(this) {
            if (it != null) {
                adapter.setListTourItem(it)
            }
        }
    }
}