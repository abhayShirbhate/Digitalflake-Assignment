package com.abhay.practise1.listing.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.abhay.practise1.databinding.FragmentListingBinding
import com.abhay.practise1.databinding.FragmentLoginBinding
import com.abhay.practise1.listing.viewmodel.ListingViewModel

class ListingFragment:Fragment() {
    lateinit var binding: FragmentListingBinding
    lateinit var viewModel: ListingViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListingBinding.inflate(inflater,container,false)
        initView()

        binding.root.setOnClickListener {  }
        return binding.root
    }

    private fun initView(){
        viewModel = ViewModelProvider(this)[ListingViewModel::class.java]
        binding.viewModel = viewModel
    }
}