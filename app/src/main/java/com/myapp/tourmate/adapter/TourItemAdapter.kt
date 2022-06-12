package com.myapp.tourmate.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.myapp.tourmate.databinding.ItemRowPopulerBinding
import com.myapp.tourmate.network.response.TourItem

class TourItemAdapter: RecyclerView.Adapter<TourItemAdapter.PopulerViewHolder>() {

    private val listTourItem = ArrayList<TourItem>()
    private val limit = 20
    private lateinit var clickItem: ClickItem

    interface ClickItem {
        fun onItemClicked(tourItem: TourItem)
    }

    fun setClickItem(clickItem: ClickItem){
        this.clickItem =clickItem
    }

    inner class PopulerViewHolder(val binding: ItemRowPopulerBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(tourItem: TourItem){
            binding.apply {
                root.setOnClickListener {
                    clickItem.onItemClicked(tourItem)
                }
                Glide.with(itemView).load(tourItem.img_url).centerCrop().into(binding.imgDesti)
                destiname.text = tourItem.Place_Name
                rating.text = tourItem.Rating
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
        return if (listTourItem.size >= limit){
            limit
        }else{
            listTourItem.size
        }
    }

    fun setListTourItem(tourItem: ArrayList<TourItem>){
        listTourItem.clear()
        listTourItem.addAll(tourItem)
        notifyDataSetChanged()
    }
}