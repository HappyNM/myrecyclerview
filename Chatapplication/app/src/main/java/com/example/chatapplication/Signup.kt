package com.example.chatapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Signup : AppCompatActivity() {
    private lateinit var edtName: EditText
    private lateinit var edtEmail: EditText
    private lateinit var edtpassword: EditText
    private lateinit var btnsighnup: Button
    private lateinit var mAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sighnup)


        supportActionBar?.hide()
        mAuth = FirebaseAuth.getInstance()

        edtName = findViewById(R.id.edt_name)
        edtEmail = findViewById(R.id.edt_email)
        edtpassword = findViewById(R.id.edt_password)
        btnsighnup = findViewById(R.id.btn_signup )

        btnsighnup.setOnClickListener {
            val email = edtEmail.text.toString()
            val password = edtpassword.text.toString()

            signup(email, password)

        }
    }
   private fun signup(email: String, password: String){
       // logic for creating an account
       mAuth.createUserWithEmailAndPassword(email, password)
           .addOnCompleteListener(this) { task ->
               if (task.isSuccessful) {
                  // code for  jumping to home
                   val intent = Intent(this@Signup, MainActivity::class.java)
                   startActivity(intent)
               } else {
                   Toast.makeText(this@Signup,"An error occured", Toast.LENGTH_SHORT).show()

               }
           }

   }


    }

















