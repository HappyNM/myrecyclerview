package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView=findViewById<ListView>(R.id.listview)
        var list= mutableListOf<model>()

        list.add(model("Bently","Bently is a nice ride",R.drawable.bently))
        list.add(model("G-Wagon","G-Wagon is a German Machine",R.drawable.gwagon))
        list.add(model("Urus","Urus are made in Italy",R.drawable.urus))
        list.add(model("Rolls-Royce","Rolls-Royce are the most luxurious rides in the world",R.drawable.rollsroyce))

        listView.setOnItemClickListener { adapterView, view, position, l ->
            if (position==0){
                Toast.makeText(this@MainActivity,"You have clicked on Bently",
                Toast.LENGTH_LONG).show()
            }
        }
    }
}