package com.example.chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        class Login : AppCompatActivity() {
            private lateinit var edtEmail: EditText
            private lateinit var edtpassword: EditText
            private lateinit var btnlogin: Button
            private lateinit var btnsighnup: Button
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_login)

                edtEmail =findViewById(R.id.edt_email)
                edtpassword =findViewById(R.id.edt_password)
                btnlogin =findViewById(R.id.bntlogin)
                btnsighnup =findViewById(R.id.btn_sighnup)

                btnsighnup.setOnClickListener {
                    val intent = Intent(this, Signup::class.java)
                    startActivity(intent)
                }




            }
        }
    }
}