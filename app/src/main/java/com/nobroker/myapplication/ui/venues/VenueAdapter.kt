package com.nobroker.myapplication.ui.venues

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.nobroker.myapplication.R
import com.nobroker.myapplication.databinding.VenueItemBinding

class VenueAdapter() :
    RecyclerView.Adapter<VenueAdapter.ViewHolder>() {
    private var venues: ArrayList<VenueViewData> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.venue_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val venue = venues[position]
        holder.bind(venue)
    }

    override fun getItemCount(): Int = venues.size

    fun setVenues(venues: List<VenueViewData>) {
        this.venues.clear()
        this.venues.addAll(venues)
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: VenueItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(venue: VenueViewData) {
            binding.dataItem = venue
        }
    }
}
