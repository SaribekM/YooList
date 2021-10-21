package com.example.yoolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {
    lateinit var recyclerViewAdapter: RecyclerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        val listOfDrivers = mutableListOf<Driver>()

        listOfDrivers.add(Driver(R.drawable.bradpitt, "Brad Pitt", 4.5F, "Aparan"))
        listOfDrivers.add(Driver(R.drawable.willsmith, "Will Smith", 3F, "Goris"))
        listOfDrivers.add(Driver(R.drawable.cage, "Nicolas Cage", 1.6F, "Sisian"))
        listOfDrivers.add(Driver(R.drawable.dicaprio, "Dicaprio", 3.7F, "Yaravan"))
        listOfDrivers.add(Driver(R.drawable.deniro, "Robert De Niro", 4.5F, "Gyumri"))
        listOfDrivers.add(Driver(R.drawable.dinklage, "Piter Dinklage", 2.8F, "Khndzoresk"))
        listOfDrivers.add(Driver(R.drawable.keanureeves, "Keanu Reaves", 4.8F, "Hrazdan"))
        listOfDrivers.add(Driver(R.drawable.norris, "CHUCK NORRIS", 4.5F, "Earth"))

        recyclerViewAdapter = RecyclerViewAdapter(listOfDrivers)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = recyclerViewAdapter

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_recycler_to_listview, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        val intent = Intent(
            this, MainActivity::class.java
        )
        startActivity(intent)
        finish()


        return true
    }
}