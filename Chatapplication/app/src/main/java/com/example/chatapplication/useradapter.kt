package com.example.chatapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class useradapter(val context: Context, val userList: ArrayList<user>):
    RecyclerView.Adapter<useradapter.userViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): userViewHolder {
     val view: View = LayoutInflater.from(context).inflate(R.layout.user_layout_xml, parent, false)
        return userViewHolder(view)

    }

    override fun onBindViewHolder(holder: userViewHolder, position: Int) {
        val currentuser = userList[position]

        holder.textName.text = currentuser.name

    }

    override fun getItemCount(): Int {
      return userList.size
    }

    class userViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
val textName = itemView.findViewById<TextView>(R.id.text_name)

    }



}


