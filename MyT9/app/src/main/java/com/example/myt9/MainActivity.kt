package com.example.myt9

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    private var mp: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickBear(view: View?) {
        mp = MediaPlayer.create(this, R.raw.bear)
        mp!!.start()
    }

    fun onClickWolf(view: View?) {
        mp = MediaPlayer.create(this, R.raw.wolf)
        mp!!.start()
    }

    fun onClickLamb(view: View?) {
        mp = MediaPlayer.create(this, R.raw.lamb)
        mp!!.start()
    }

    fun onClickElephant(view: View?) {
        mp = MediaPlayer.create(this, R.raw.elephant)
        mp!!.start()
    }
}