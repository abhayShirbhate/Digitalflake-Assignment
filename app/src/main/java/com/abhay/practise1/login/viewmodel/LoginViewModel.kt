package com.abhay.practise1.login.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.abhay.practise1.login.listener.IOnLoginFragmentHandler
import com.abhay.practise1.login.listener.IOnLoginFragmentListener

class LoginViewModel:ViewModel(),IOnLoginFragmentHandler {
    lateinit var iOnListener: IOnLoginFragmentListener

    val phoneNumberValue: ObservableField<String> = ObservableField("")
    val passwordValue: ObservableField<String> = ObservableField("")
    val isLoginButtonEnable: ObservableField<Boolean> = ObservableField<Boolean>(false)

    override fun onLoginButtonClick() {
        iOnListener.onLoginButtonClick()
    }

}