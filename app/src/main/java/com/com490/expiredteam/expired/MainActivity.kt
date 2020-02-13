package com.com490.expiredteam.expired

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manual_input_btn.setOnClickListener {

        }

        ScanButton.setOnClickListener {
            val intent = Intent(this, ScanCodeActivity::class.java)
            startActivity(intent)
        }
    }
}
