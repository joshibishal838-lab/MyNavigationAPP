package com.jeiu.mynavigationapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jeiu.mynavigationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}