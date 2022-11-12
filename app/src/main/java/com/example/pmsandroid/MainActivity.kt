package com.example.pmsandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.common.expand.hideSystemStatusBar
import com.example.common.util.FragmentStackUtil
import com.example.login.LoginFragment
import com.example.pmsandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        hideSystemStatusBar()
        super.onCreate(savedInstanceState)
        val viewBinding = ActivityMainBinding.inflate(layoutInflater)
        FragmentStackUtil.addToMainFragment(supportFragmentManager, LoginFragment.newInstance(), tag = "Login_Fragment", addToStack = false, stackName = "Login_Fragment")
        setContentView(viewBinding.root)
    }

    override fun onResume() {
        hideSystemStatusBar()
        super.onResume()
    }
}