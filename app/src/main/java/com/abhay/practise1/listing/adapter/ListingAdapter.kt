package com.abhay.practise1.listing.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.abhay.practise1.R
import com.abhay.practise1.databinding.AdaptorItemBinding
import com.abhay.practise1.listing.DataModel

class ListingAdapter(val list: Array<DataModel>): RecyclerView.Adapter<ListingAdapter.ItemViewHolder>() {

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adaptor_item,parent,false)
        return ItemViewHolder(view)

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.onBind(position)
    }


    inner class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        private var binding: AdaptorItemBinding = AdaptorItemBinding.bind(view.rootView)

        fun onBind(position: Int){
            binding.textView.text = list[position].text
            binding.btnClickHere.setOnClickListener {
                Toast.makeText(view.context,list[position].text,Toast.LENGTH_LONG).show()
            }
        }


    }
}