package com.example.hw2_myapplication

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.hw2_myapplication.databinding.CustomViewBinding


class CustomView(context: Context, attrs: AttributeSet?) : LinearLayout(context, attrs) {
    private val binding = CustomViewBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)
    }

    fun setFirstText(text: String) {
        binding.firstText.text = text
    }

    fun setSecondText(text: String) {
        binding.secondText.text = text
    }

}