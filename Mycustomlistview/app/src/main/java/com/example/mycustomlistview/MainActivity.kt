package com.example.mycustomlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listview=findViewById<ListView>(R.id.listView)
        var list= mutableListOf<Model>()

        list.add(Model("Painting","Painting is done by who",R.drawable.painting))
        list.add(Model("Pineapple","It is yellow in color",R.drawable.pineapple))
        list.add(Model("Avocado","It is green in color",R.drawable.avocado))
        list.add(Model("Strawberry","It is red in color",R.drawable.strawberry))
        list.add(Model("Kiwi","It is green in color",R.drawable.kiwi))
        list.add(Model("Pawpaw","It is orange in color",R.drawable.pawpaw))

        listview.adapter=MyAdapter(this,R.layout.row,list)
    }
}