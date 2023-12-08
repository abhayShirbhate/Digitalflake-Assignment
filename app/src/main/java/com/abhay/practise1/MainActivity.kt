package com.abhay.practise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhay.practise1.login.fragment.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.mainContainer,LoginFragment())
            .commit()

    }
}