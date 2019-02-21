package com.example.msgshareapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bun:Bundle? = intent.extras
        val Msg = bun!!.getString("user_message")
        Toast.makeText(this,Msg,Toast.LENGTH_SHORT).show()
        txtUserMessage.text = Msg
    }
}