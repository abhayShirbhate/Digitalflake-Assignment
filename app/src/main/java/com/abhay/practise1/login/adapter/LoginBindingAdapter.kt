package com.abhay.practise1.login.adapter

import android.widget.Button
import androidx.databinding.BindingAdapter
import androidx.databinding.Observable
import androidx.databinding.Observable.OnPropertyChangedCallback
import androidx.databinding.ObservableField
import com.abhay.practise1.login.listener.IOnLoginFragmentHandler
import com.abhay.practise1.login.viewmodel.LoginViewModel

object LoginBindingAdapter {

    @JvmStatic
    @BindingAdapter("loginValidator")
    fun Button.loginValidator(viewModel: LoginViewModel){

            val onPropertyChangedCallback = object : OnPropertyChangedCallback(){
            override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
                validatePhoneNumberNPassword(viewModel)
            }
        }

        viewModel.phoneNumberValue.addOnPropertyChangedCallback(onPropertyChangedCallback)
        viewModel.passwordValue.addOnPropertyChangedCallback(onPropertyChangedCallback)

    }

    private fun validatePhoneNumberNPassword(viewModel: LoginViewModel){
        if ((viewModel.phoneNumberValue.get()?.length ?: 0) == 10 && viewModel.passwordValue.get()?.isNotEmpty() == true){
            viewModel.isLoginButtonEnable.set(true)
        }else viewModel.isLoginButtonEnable.set(false)
    }
}