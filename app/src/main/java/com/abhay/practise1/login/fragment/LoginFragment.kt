package com.abhay.practise1.login.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.abhay.practise1.R
import com.abhay.practise1.databinding.FragmentLoginBinding
import com.abhay.practise1.listing.fragment.ListingFragment
import com.abhay.practise1.login.listener.IOnLoginFragmentListener
import com.abhay.practise1.login.viewmodel.LoginViewModel

class LoginFragment:Fragment(),IOnLoginFragmentListener {
    lateinit var binding: FragmentLoginBinding
    lateinit var viewModel : LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater,container,false)
        initView()

        binding.root.setOnClickListener {  }
        return binding.root
    }

    private fun initView(){
        viewModel = ViewModelProvider(this)[LoginViewModel::class.java]
        viewModel.iOnListener = this
        binding.viewModel = viewModel
        binding.iOnHandler = viewModel

    }

    override fun onLoginButtonClick() {
        parentFragmentManager.beginTransaction().replace(R.id.mainContainer,ListingFragment()).commit()
    }
}