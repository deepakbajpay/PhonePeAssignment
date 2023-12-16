package com.nobroker.myapplication.ui.venues

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nobroker.myapplication.data.remote.dto.Venue
import com.nobroker.myapplication.databinding.VenueItemBinding

class VenueAdapter(private val onItemClick: (Venue) -> Unit) :
    RecyclerView.Adapter<VenueAdapter.ViewHolder>() {
    private var venues: ArrayList<Venue> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = VenueItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val venue = venues[position]
        holder.bind(venue)
        holder.itemView.setOnClickListener { onItemClick(venue) }
    }

    override fun getItemCount(): Int = venues.size

    fun setVenues(venues: List<Venue>) {
        this.venues.clear()
        this.venues.addAll(venues)
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: VenueItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(venue: Venue) {
            binding.textViewName.text = venue.name
            binding.textViewCity.text = venue.city
            binding.textViewAddress.text = venue.address
        }
    }
}
