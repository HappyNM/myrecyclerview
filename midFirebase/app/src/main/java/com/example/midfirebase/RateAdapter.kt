package com.example.midfirebase

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class RateAdapter (val mctx:Context,val layoutResid:Int,val RateList:List<Rate>):
        ArrayAdapter<Rate>(mctx,layoutResid,RateList) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mctx)
        val view: View = layoutInflater.inflate(layoutResid, null)
        val txt_view=view.findViewById<TextView>(R.id.listView);

        val rate=RateList[position]
        txt_view.text=rate.name;
        return view


    }

}