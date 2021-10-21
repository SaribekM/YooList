package com.example.yoolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ListView
import android.widget.AdapterView

import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var listAdapter: ListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfDrivers = mutableListOf<Driver>()
        listOfDrivers.add(Driver(R.drawable.bradpitt, "Brad Pitt", 4.5F, "Aparan"))
        listOfDrivers.add(Driver(R.drawable.willsmith, "Will Smith", 3F, "Goris"))
        listOfDrivers.add(Driver(R.drawable.cage, "Nicolas Cage", 1.6F, "Sisian"))
        listOfDrivers.add(Driver(R.drawable.dicaprio, "Dicaprio", 3.7F, "Yaravan"))
        listOfDrivers.add(Driver(R.drawable.deniro, "Robert De Niro", 4.5F, "Gyumri"))
        listOfDrivers.add(Driver(R.drawable.dinklage, "Piter Dinklage", 2.8F, "Khndzoresk"))
        listOfDrivers.add(Driver(R.drawable.keanureeves, "Keanu Reaves", 4.8F, "Hrazdan"))
        listOfDrivers.add(Driver(R.drawable.norris, "CHUCK NORRIS", 4.5F, "Earth"))

        listAdapter = ListAdapter(this, listOfDrivers)

        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = listAdapter


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_listview_to_recycler, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        val intent = Intent(
            this, RecyclerActivity::class.java
        )
        startActivity(intent)

        finish()

        return true
    }


}