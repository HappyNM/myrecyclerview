package com.example.mixy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Buttonadd:Button
    lateinit var Buttonsubtract:Button
    lateinit var Buttondivide:Button
    lateinit var Buttonmultiply:Button
    lateinit var firstnumber:EditText
    lateinit var secondnumber:EditText
    lateinit var textanswer:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Buttonadd = findViewById(R.id.it_sum)
        Buttonsubtract = findViewById(R.id.it_subtract)
        Buttondivide = findViewById(R.id.it_divide)
        Buttonmultiply = findViewById(R.id.it_multiply)
        Buttonadd.setOnClickListener {
            var firstnum = firstnumber.text.toString()
            var secondnum = secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()) {
                textanswer.text = "please fill the blank spaces"
            } else {
                var answer = firstnum.toDouble() + secondnum.toDouble()
                textanswer.text = answer.toString()
            }
        }
        Buttonsubtract.setOnClickListener {
            var firstnum = firstnumber.text.toString()
            var secondnum = secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()) {
                textanswer.text = "please fill the blank spaces"
            } else {
                var answer = firstnum.toDouble() - secondnum.toDouble()
                textanswer.text = answer.toString()
            }
        }
        Buttondivide.setOnClickListener {
            var firstnum = firstnumber.text.toString()
            var secondnum = secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()) {
                textanswer.text = "please fill the blank spaces"
            } else {
                var answer = firstnum.toDouble() /secondnum.toDouble()
                textanswer.text = answer.toString()
            }
        }
        Buttonmultiply.setOnClickListener {
            var firstnum = firstnumber.text.toString()
            var secondnum = secondnumber.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()) {
                textanswer.text = "please fill the blank spaces"
            } else {
                var answer = firstnum.toDouble() * secondnum.toDouble()
                textanswer.text = answer.toString()
            }
        }
        }

    }