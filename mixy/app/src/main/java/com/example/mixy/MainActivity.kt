package com.example.mixy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var ButtonCal:Button
    lateinit var ButtonWeb:Button
    lateinit var ButtonIntent:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonCal=findViewById(R.id.btn_calc)
        ButtonWeb=findViewById(R.id.it_web)
        ButtonIntent=findViewById(R.id.it_iris)
        ButtonCal.setOnClickListener {
            val intent=Intent(this,CalculatorActivity::class.java)
            startActivity(intent)
        }
        ButtonWeb.setOnClickListener {
            val tent=Intent(this,WebActivity::class.java)
            startActivity(tent) }
        ButtonIntent.setOnClickListener {
            val ten=Intent(this,IntentActivity::class.java)
            startActivity(ten)
        }

    }
}