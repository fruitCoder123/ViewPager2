package com.example.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView


class ViewPagerAdapter(
    val images: List<Int>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {

    class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val iv: ImageView = itemView.findViewById(R.id.ivImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager, parent, false)
        return ViewPagerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.ViewPagerViewHolder, position: Int) {
        val curImage = images[position]
        holder.iv.setImageResource(curImage)
    }
}