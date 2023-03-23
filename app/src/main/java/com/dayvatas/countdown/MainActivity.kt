package com.dayvatas.countdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.dayvatas.countdown.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Abstract - Inheritance
        object : CountDownTimer(10000, 1000){
            override fun onTick(p0: Long) {         //p0 = millisUntilFinished
                binding.textView.text= "Left: ${p0/1000}"
            }

            override fun onFinish() {
                binding.textView.text = "Left: 0"
            }

        }.start()
    }
}