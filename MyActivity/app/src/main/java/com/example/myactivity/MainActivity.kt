package com.example.myactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myGoNext : Button = findViewById(R.id.buNext)
        myGoNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java).apply{
            putExtra("key1",  findViewById<EditText>(R.id.EtName).text.toString());
        }
        startActivity(intent);
        }

    }
}