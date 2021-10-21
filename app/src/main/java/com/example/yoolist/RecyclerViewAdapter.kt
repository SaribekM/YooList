package com.example.yoolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private var itemsList: List<Driver>) :
    RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val photo = view.findViewById<ImageView>(R.id.imageView)
        val nameD = view.findViewById<TextView>(R.id.textViewName)
        val rating = view.findViewById<RatingBar>(R.id.ratingBar)
        val desc = view.findViewById<TextView>(R.id.textViewDesc)

    }

    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val itemView = inflater.inflate(R.layout.list_items, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val photo = holder.photo
        val name = holder.nameD
        val rating = holder.rating
        val desc = holder.desc

        photo.setImageResource(itemsList[position].photo)
        name.text = itemsList[position].name
        rating.rating = itemsList[position].rating
        desc.text = itemsList[position].desc


    }

    override fun getItemCount(): Int {
        return itemsList.size
    }
}