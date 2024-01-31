package com.example.myeventsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class ThirdActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val myButton: Button = findViewById(R.id.buInterface)
        myButton.setOnClickListener(this)
    }
    // Implement the OnClickListener callback
    override fun onClick(view: View) {
        Toast.makeText(applicationContext, "Interface event", Toast.LENGTH_SHORT).show()
    }
}