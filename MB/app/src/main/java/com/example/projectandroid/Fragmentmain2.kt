package com.example.projectandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_home.*

class Fragmentmain2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)


        imageView3.setOnClickListener{
            val intent = Intent (this, RegisterComplete:: class.java)
            startActivity(intent)
        }

    }
}
//อันนี้คือฟังชั่นที่กดรูปภาพแล้วจะไปหน้าจอรายละเอียด

