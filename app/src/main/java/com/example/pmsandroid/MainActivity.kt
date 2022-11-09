package com.example.pmsandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.common.expand.hideSystemStatusBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hideSystemStatusBar()
    }
}