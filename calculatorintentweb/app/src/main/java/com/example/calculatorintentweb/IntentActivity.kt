package com.example.calculatorintentweb

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.util.jar.Manifest


class IntentActivity : AppCompatActivity() {
    var Buttonsms: Button? = null
    lateinit var Buttonemail: Button
    lateinit var Buttoncamera: Button
    lateinit var Buttonstk: Button
    lateinit var Buttonshare: Button
    lateinit var Buttoncall: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intentactivity)
        Buttonsms = findViewById(R.id.buttonsms)
        Buttoncamera = findViewById(R.id.buttoncamera)
        Buttonemail = findViewById(R.id.buttonemail)
        Buttonstk = findViewById(R.id.buttonstk)
        Buttonshare = findViewById(R.id.buttonshare)
        Buttoncall = findViewById(R.id.buttoncall)


        Buttonsms!!.setOnClickListener {
            val uri = Uri.parse("smsto:0794981940")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("sms_body", "The SMS text")

            startActivity(intent)
        }
        Buttoncamera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takePictureIntent, 1)

        }
        Buttoncall.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

            if (ContextCompat.checkSelfPermission(
                    this@IntentActivity,
                    android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@IntentActivity,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }
                }
                Buttonemail.setOnClickListener {
                    val emailIntent =
                        Intent(
                            Intent.ACTION_SENDTO,
                            Uri.fromParts("mailto", "grevinkatiech@gmail.com", null)
                        )
                    emailIntent.putExtra(Intent.EXTRA_SUBJECT, "job application")
                    emailIntent.putExtra(Intent.EXTRA_TEXT, "dear grevins")
                    startActivity(Intent.createChooser(emailIntent, "send email"))
                }
                Buttonshare.setOnClickListener {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "hey doedghfdjyg")
                    startActivity(shareIntent)
                }
Buttonstk.setOnClickListener {
    val simToolKitLaunchIntent=
        applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
    simToolKitLaunchIntent?.let { startActivity(it) }
}

            }
        }











