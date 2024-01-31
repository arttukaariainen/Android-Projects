package com.example.calc1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstVal: EditText = findViewById(R.id.etFirstNum)
        val secondVal: EditText = findViewById(R.id.etSecondNum)
        val sumButton: Button = findViewById(R.id.buSum)
        val minButton: Button = findViewById(R.id.buMin)
        val multButton: Button = findViewById(R.id.buMult)
        val divButton: Button = findViewById(R.id.buDiv)
        val resultTv: TextView = findViewById(R.id.tvResult)

        sumButton.setOnClickListener {
            val first = firstVal.text.toString().toDouble()
            val second = secondVal.text.toString().toDouble()
            resultTv.text = (first+second).toString()
        }

        minButton.setOnClickListener {
            val first = firstVal.text.toString().toDouble()
            val second = secondVal.text.toString().toDouble()
            resultTv.text = String.format("%.2f", first-second)
        }

        multButton.setOnClickListener {
            val first = firstVal.text.toString().toDouble()
            val second = secondVal.text.toString().toDouble()
            resultTv.text = String.format("%.2f", first*second)
        }

        divButton.setOnClickListener {
            val first = firstVal.text.toString().toDouble()
            val second = secondVal.text.toString().toDouble()
            resultTv.text = String.format("%.2f", first/second)
        }
    }
}