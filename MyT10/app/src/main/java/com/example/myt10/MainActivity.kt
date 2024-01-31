package com.example.myt10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity(), PopupMenu.OnMenuItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        //adds items to the action bar
        menuInflater.inflate(R.menu.myopmenu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handles presses on the action bar items
        return when (item.itemId) {
            R.id.prof -> {
                Toast.makeText(applicationContext, "PROFILE", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.out -> {
                Toast.makeText(applicationContext, "LOG OUT", Toast.LENGTH_SHORT).show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    fun showPopup(view: View?) {
        val popup = PopupMenu(this, view)
        popup.setOnMenuItemClickListener(this)
        popup.inflate(R.menu.mypopup)
        popup.show()
    }

    override fun onMenuItemClick(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.forward -> {
                Toast.makeText(baseContext, "FORWARD MESSAGE", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.delete -> {
                Toast.makeText(baseContext, "DELETE MESSAGE", Toast.LENGTH_SHORT).show()
                true
            }
            else -> false
        }
    }
}