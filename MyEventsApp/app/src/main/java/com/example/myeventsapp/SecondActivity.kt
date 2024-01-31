package com.example.myeventsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    fun buttonMsg(view: View?) {
        Toast.makeText(applicationContext, "OnClick event", Toast.LENGTH_SHORT).show()
    }
}