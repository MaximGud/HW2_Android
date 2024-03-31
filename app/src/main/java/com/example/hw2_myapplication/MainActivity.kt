package com.example.hw2_myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hw2_myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.customView02.setFirstText("Настройка верхней строки из кода программы")
        binding.customView02.setSecondText("Настройка нижней строки из кода программы")
    }
}