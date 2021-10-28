package com.github.jahongk.jkcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.jahongk.calclib.Calc
import com.github.jahongk.jkcalc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val calc = Calc()
        val sum = calc.sum(1, 2)
        binding.resultTextView.text = "$sum"
    }
}