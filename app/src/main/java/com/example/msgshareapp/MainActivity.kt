package com.example.msgshareapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            Log.i("MainActivity", "Button was clicked!")
            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()
        }

        btnSend.setOnClickListener {
            val Msg: String = etUserMessage.text.toString()


            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message",Msg)
            startActivity(intent)


        }
    }
}
