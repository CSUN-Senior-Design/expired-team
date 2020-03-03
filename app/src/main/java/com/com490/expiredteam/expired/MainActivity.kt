package com.com490.expiredteam.expired

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manualButton.setOnClickListener {
            val intent = Intent(this, manualinputPage::class.java)
            startActivity(intent)
        }
        ScanButton.setOnClickListener {
            val intent = Intent(this, ScanningPage::class.java)
            startActivity(intent)
        }
    }
}