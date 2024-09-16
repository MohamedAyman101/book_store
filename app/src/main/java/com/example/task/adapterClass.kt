package com.example.task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class adapterClass (private val booksList : List<itemsClass>) :RecyclerView.Adapter<adapterClass.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.book_list,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return booksList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = booksList[position]
        holder.image.setImageResource(currentItem.pic)
        holder.name.text = currentItem.name
        holder.descpripe.text =currentItem.descption
        holder.Rating.rating= currentItem.rate.toFloat()

    }
    class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
            val image : ImageView = itemView.findViewById(R.id.imageVV)
            val name : TextView = itemView.findViewById(R.id.book_name)
            val descpripe : TextView = itemView.findViewById(R.id.descrption)
            val Rating : RatingBar =itemView.findViewById(R.id.ratingBar)
    }
}