package com.example.nchi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onclicked(view: View) {
        if (checkBox.isChecked) textView.text = "Kenya: we speak english"
        if (checkBox2.isChecked) textView.text = "Uganda: yes but we prefer kiswahili"
        if (checkBox3.isChecked) textView.text = "Tanzania:yes but wee prefer kiswahili"

    }
}