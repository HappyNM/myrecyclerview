package com.example.calculatorintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculatorActivity : AppCompatActivity() {
   lateinit var buttonadd:Button
    lateinit var buttonsub:Button
    lateinit var buttonmult:Button
    lateinit var buttondiv:Button
    lateinit var fnum:EditText
    lateinit var secnum:EditText
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculatoractivity)
        buttonadd=findViewById(R.id.btn_add)
        buttonmult=findViewById(R.id.btn_mult)
        buttondiv=findViewById(R.id.btn_div)
        buttonsub=findViewById(R.id.btn_sub)
        fnum=findViewById(R.id.number)
        secnum=findViewById(R.id.number)
        textView=findViewById(R.id.textView)
        buttonadd.setOnClickListener{
            var Firstnum= fnum.toString()
            var secondnum= secnum.toString()
            if (Firstnum.isEmpty() && secondnum.isEmpty()) {
                textView.text = "invalid"
            }else{
                var answer =Firstnum.toDouble() + secondnum.toDouble()
                textView.text = answer.toString()
            }





    }





        }

}