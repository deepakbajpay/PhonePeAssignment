package com.nobroker.myapplication.ui.venues

import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nobroker.myapplication.R
import com.nobroker.myapplication.base.BaseActivity
import com.nobroker.myapplication.utils.OperationResult
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity(R.layout.activity_main) {
    private val viewModel: VenueViewModel by viewModels()
    private lateinit var venueAdapter: VenueAdapter

    override fun setupView() {

        venueAdapter = VenueAdapter { venue ->
            // Handle item click, open ticket link or perform other actions
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(venue.url))
            startActivity(intent)
        }

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = venueAdapter

        // Observe changes in the venue list
        viewModel.venues.observe(this) { state ->
            when (state) {
                is OperationResult.Error -> if (state.data != null) {
                    venueAdapter.setVenues(state.data)
                    Toast.makeText(this, state.message, Toast.LENGTH_SHORT).show()
                }

                is OperationResult.Loading -> {
                    //show loading
                }

                is OperationResult.Success -> {
                    if (state.data != null)
                        venueAdapter.setVenues(state.data)
                }
            }

        }

        viewModel.getVenues(
            "Mzg0OTc0Njl8MTcwMDgxMTg5NC44MDk2NjY5",
            10,
            1,
            12.971599,
            77.594566,
            "12mi",
            ""
        )
    }
}
