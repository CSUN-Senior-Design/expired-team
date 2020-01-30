package com.com490.expiredteam.expired

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manual_input_btn.setOnClickListener {
            // Test code for custom toast.
            var toastView = LayoutInflater.from(this).inflate(R.layout.custom_toast, findViewById(R.id.custom_toast_layout))
            var toast = Toast(this)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.duration = Toast.LENGTH_LONG
            toast.view = toastView
            toast.show()
        }
    }
}
