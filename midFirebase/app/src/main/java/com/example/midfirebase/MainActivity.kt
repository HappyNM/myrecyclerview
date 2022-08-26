package com.example.midfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.RatingBar
import com.google.firebase.database.*

class MainActivity : AppCompatActivity() {

    lateinit var edt_text:EditText
    lateinit var ratingBar: RatingBar
    lateinit var btn_save:Button
    lateinit var ListView:ListView
    lateinit var RateList:MutableList<Rate>
    lateinit var ref:DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RateList= mutableListOf()
        ref=FirebaseDatabase.getInstance().getReference("rates")
        edt_text=findViewById(R.id.edt_text)
        ratingBar=findViewById(R.id.ratingbar)
        btn_save=findViewById(R.id.btn_save)
        ListView=findViewById(R.id.listView)

        btn_save.setOnClickListener {
            saverate()
        }
        ref.addValueEventListener(object:ValueEventListener{
            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

            override fun onDataChange(snapshot: DataSnapshot) {
                TODO("Not yet implemented")
                if (snapshot.exists()){
                    RateList.clear()
                    for (h in snapshot.children){
                        val Rate=h.getValue(Rate::class.java)
                        if (Rate !=null){
                            RateList.add(Rate)
                        }
                    }
                    val adapter=RateAdapter(applicationContext,R.layout.rates,RateList)
                    ListView.adapter=adapter
                })
            }

            private fun saverate(){
                val name=edt_text.text.toString().trim()
                if (name.isEmpty())
            }







    }
}