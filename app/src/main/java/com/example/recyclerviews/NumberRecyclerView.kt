package com.example.recyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NumberRecyclerView(var numList: List<BigInteger>): RecyclerView.Adapter<numberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):numberViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.number_list_item,parent,false)
        return numberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: numberViewHolder, position: Int) {
        holder.tvNumber.text=numList.get(position).toString()

    }

    override fun getItemCount(): Int {

        return numList.size
    }

}
class numberViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val  tvNumber=itemView.findViewById<TextView>(R.id.tvNumber)
}