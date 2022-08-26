package com.example.firebase1

import android.content.Context
import android.provider.DocumentsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class RateAdapter(val mctx: Context, val layoutResid: Int, val Ratelist: List<Rate>, position: Int):
 ArrayAdapter<Rate>(mctx,layoutResid,Ratelist) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup):
            val layoutInflater:LayoutInflater=LayoutInflater.from(mctx)
    val view:View=layoutInflater.inflate(layoutResid,r:null)
            val txt_view=view.findViewById<TextView>(R.id.txt_View)
             val rate=Ratelist[position]
             txt_view.text=rate.name
             return view
    }

}