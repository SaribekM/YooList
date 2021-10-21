package com.example.yoolist

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

class ListAdapter(val activity: Activity, val list: List<Driver>) :
    ArrayAdapter<Driver>(activity, R.layout.list_items) {
    override fun getCount(): Int {
        return list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val context=activity.layoutInflater
        val singleView=context.inflate(R.layout.list_items,null)

        val photo=singleView.findViewById<ImageView>(R.id.imageView)
        val name=singleView.findViewById<TextView>(R.id.textViewName)
        val rating=singleView.findViewById<RatingBar>(R.id.ratingBar)
        val desc= singleView.findViewById<TextView>(R.id.textViewDesc)

        photo.setImageResource(list[position].photo)
        name.text=list[position].name
        rating.rating=list[position].rating
        desc.text=list[position].desc

        return singleView
    }
}