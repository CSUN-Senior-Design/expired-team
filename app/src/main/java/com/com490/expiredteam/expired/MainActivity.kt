package com.com490.expiredteam.expired

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val id: Int = 10
    val language: String = "kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        manualButton.setOnClickListener() {
            intent = Intent(this, manualinputPage::class.java)
            startActivity(intent)
        }
    }
}