package com.example.fragmentskotlin.Recyclers

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentskotlin.R

class RecyclerViewAdapter(llistat: MutableList<String>, context: Context?): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    var llistat: MutableList<String> = llistat;
    var context: Context? = context;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_list, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtNom.setText(llistat.get(position));
    }

    override fun getItemCount(): Int {
        return llistat.size;
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtNom: TextView = view.findViewById(R.id.itemNom);

    }
}

