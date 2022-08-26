package com.example.mixy

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class IntentActivity : AppCompatActivity() {
    lateinit var Buttonphone:Button
    lateinit var ButtonGmail:Button
    lateinit var ButtonSTK:Button
    lateinit var ButtonCamera:Button
    lateinit var ButtonSMS:Button
    lateinit var ButtonDial:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        ButtonSMS=findViewById(R.id.it_sms)

        ButtonSMS.setOnClickListener {
            val uri:Uri= Uri.parse("smsto:YOUR_SMS_NUMBER")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("sms_body", "The SMS text")

            startActivity(intent)


        }
        ButtonCamera=findViewById(R.id.it_Camera)
        ButtonCamera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takePictureIntent, 1)

        }
          ButtonGmail=findViewById(R.id.it_gmail)
        ButtonGmail.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))


        }
        ButtonDial=findViewById(R.id.it_Dial)
        ButtonDial.setOnClickListener {
            val phone = "+34666777888"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)

        }
        

    }
}