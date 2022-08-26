
package com.example.firebase1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.RatingBar
import com.example.firebase1.R
import com.google.firebase.database.*

class MainActivity : AppCompatActivity() {
    lateinit var edt_text:EditText
    lateinit var ratingBar: RatingBar
    lateinit var btn_save:Button
    lateinit var ListView:ListView
    lateinit var Ratelist:MutableList<Rate>
    lateinit var ref:DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Ratelist= mutableListOf()
        ref=FirebaseDatabase.getInstance().getReference("rate")

        edt_text=findViewById(R.id.edt_text)
        ratingBar=findViewById(R.id.ratingbar)
        btn_save=findViewById(R.id.btn_save)
        ListView=findViewById(R.id.listView)

        btn_save.setOnClickListener {

        }

        ref.addValueEventListener(object:ValueEventListener{
            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

            override fun onDataChange(snapshot: DataSnapshot){
                if (snapshot.exists()){
                    Ratelist.clear()
                    for (h in snapshot.children){
                        val rate=h.getValue(R)
                    }
                }
            }
            private fun saverate(){
                val name=edt_text.text
            }
        }



    }
}
