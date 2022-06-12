package com.myapp.tourmate.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.myapp.tourmate.databinding.ItemRowPopulerBinding
import com.myapp.tourmate.network.response.TourItem

class PopulerAdapter: RecyclerView.Adapter<PopulerAdapter.PopulerViewHolder>() {

    private val listTourItem = ArrayList<TourItem>()

    inner class PopulerViewHolder(val binding: ItemRowPopulerBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(tourItem: TourItem){
            binding.apply {
                root.setOnClickListener { return@setOnClickListener }
                destiname.text = tourItem.Place_Name
                rating.text = tourItem.rating
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopulerViewHolder {
        val view = ItemRowPopulerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PopulerViewHolder(view)
    }

    override fun onBindViewHolder(holder: PopulerViewHolder, position: Int) {
        holder.bind(listTourItem[position])
    }

    override fun getItemCount(): Int {
        return listTourItem.size
    }

    fun setListTourItem(tourItem: ArrayList<TourItem>){
        listTourItem.clear()
        listTourItem.addAll(tourItem)
    }
}