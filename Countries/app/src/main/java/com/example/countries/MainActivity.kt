package com.example.countries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClicked(view:View){
        if (kenyacheckBox.isChecked) textresult.text="Kenya is the correct answer"
        if (ugandacheckBox.isChecked) textresult.text="Uganda is the correct answer"
        if (djibouticheckBox.isChecked) textresult.text="Djibouti is the wrong answer"

    }
    fun onSelect(view: View){
        if (radioyes.isChecked) textresult.text="Yes am certified."
        if (radiono.isChecked) textresult.text="No am not certified."
        if (radionotsure.isChecked) textresult.text="Not sure"
    }
}