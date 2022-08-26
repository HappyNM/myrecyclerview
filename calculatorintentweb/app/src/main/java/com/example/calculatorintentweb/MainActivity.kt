package com.example.calculatorintentweb

import android.accessibilityservice.AccessibilityButtonController
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.FillEventHistory
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var ButtonCalc: Button? = null
    var ButtononWeb: Button? = null
    var Buttonintent: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonCalc = findViewById(R.id.button)
        ButtonCalc!!.setOnClickListener {
            val intent = Intent(this, calculatorActivity::class.java)
            startActivity(intent)

        }
        ButtononWeb =findViewById(R.id.button3)
        ButtononWeb!!.setOnClickListener {
            val intent= Intent(this,WebActivity::class.java)
            startActivity(intent)

        }
        Buttonintent =findViewById(R.id.button2)
        Buttonintent!!.setOnClickListener {
            val intent= Intent(this,IntentActivity::class.java)
startActivity(intent)        }
    }
}

