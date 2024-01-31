package com.example.myactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView = findViewById<TextView>(R.id.TwName)
        var extras: Bundle? = intent.extras
        var string1 = extras!!.getString("key1");
        textView.setText(string1);
    }
}