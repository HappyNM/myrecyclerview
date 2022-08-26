
package com.example.userinterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var btn_to:Button ?=null
    var NEXT:Button ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_to=findViewById(R.id.btn_to)
        NEXT=findViewById(R.id.NEXT)

       btn_to!!.setOnClickListener {
           val intent= Intent( this, foodActivity::class.java)
           startActivity(intent)
       }
        NEXT!!.setOnClickListener {
            val intent= Intent(this, foodActivity2::class.java)
            startActivity(intent)
        }
    }
}