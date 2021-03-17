package com.example.reload

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.itemrecycler.view.*

class AdapterRecycler(var model:ArrayList<Model>) : RecyclerView.Adapter<AdapterRecycler.Holder>() {

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView

        init {
            textView = itemView.text1
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder = Holder(LayoutInflater.from(parent.context).inflate(R.layout.itemrecycler, parent, false))

    override fun getItemCount(): Int = model.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
            holder.textView.text1.text = model[position].name
    }
}


