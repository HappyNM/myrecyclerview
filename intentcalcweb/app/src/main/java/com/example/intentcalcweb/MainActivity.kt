package com.example.intentcalcweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Btn_2.setOnClickListener {
            val intent = Intent(this, intentactivity::class.java)
            startActivity(intent)
        }
        Btn_1.setOnClickListener {
            val calculator = Intent(this, calcactivity::class.java)
        }
    }

}



