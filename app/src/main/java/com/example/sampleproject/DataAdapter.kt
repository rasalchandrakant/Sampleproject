package com.example.sampleproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataAdapter(private val itemList: MutableList<NumberItem>) :
    RecyclerView.Adapter<DataAdapter.MyViewHolder>() {




    // ViewHolder class holds references to the views for each item in the RecyclerView
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.tv_number)
    }

    // onCreateViewHolder is called when the ViewHolder is created.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view)
    }

    // onBindViewHolder is called to bind the data to the views.
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.textView.text = currentItem.text
    }

    // getItemCount returns the number of items in the data set.
    override fun getItemCount(): Int {
        return itemList.size
    }
}