package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter (var mctx:Context,var resources:Int,var items:List<model>):
    ArrayAdapter<model>(mctx,resources,items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater=LayoutInflater.from(mctx)
        val view:View=layoutInflater.inflate(resources,null)

        val imageView:ImageView=view.findViewById(R.id.imageview)
        val titletextview:TextView=view.findViewById(R.id.txtview)
        val descriptiontextview:TextView=view.findViewById(R.id.txtsub)
        var item:model=items[position]
        imageView.setImageDrawable(mctx.resources.getDrawable(item.img))
        titletextview.text=item.tittle
        descriptiontextview.text=item.description

        return view
    }
}