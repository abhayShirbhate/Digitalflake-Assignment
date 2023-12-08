package com.abhay.practise1.listing.adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abhay.practise1.listing.viewmodel.ListingViewModel

object ListingBindingAdaptor {
    @JvmStatic
    @BindingAdapter("setRecyclerView")
    fun RecyclerView.setRecyclerView(listingViewModel: ListingViewModel){
        layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        adapter = getListingAdapter(listingViewModel)
    }

    private fun getListingAdapter(viewModel: ListingViewModel):ListingAdapter{
        return ListingAdapter(viewModel.dataList)
    }
}