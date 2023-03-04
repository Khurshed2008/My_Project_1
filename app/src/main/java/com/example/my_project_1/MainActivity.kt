package com.example.my_project_1

import android.content.IntentSender.OnFinished
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        object: CountDownTimer(10000,1000){
            override fun onTick(milisUntilFinished: Long) {
                println(milisUntilFinished / 1000)
                TODO("Not yet implemented")
            }
            override fun onFinish() {
                TODO("Not yet implemented")
                println("It is finished")
                println("hello")
            }
        }
    }
}