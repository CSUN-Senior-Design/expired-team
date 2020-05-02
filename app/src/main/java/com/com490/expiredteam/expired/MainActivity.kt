package com.com490.expiredteam.expired

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var myAppDatabase: MyAppDatabase = Room.databaseBuilder(applicationContext,MyAppDatabase :: class.java,"Products").build()

       /* Thread {
            var pro = Product()
            pro.name = "Slick"

            myAppDatabase.myDao().addName(pro)
        }.start()
        */
        manualButton.setOnClickListener {
            val intent = Intent(this, manualinputPage::class.java)
            startActivity(intent)
        }
        ScanButton.setOnClickListener {
            val intent2 = Intent(this, ScanningPage::class.java)
            startActivity(intent2)
        }

        all_items.setOnClickListener {
            val intent3 = Intent(this, ShowProductActivity::class.java)
            startActivity(intent3)
        }

        //add the page that the all item will diplay
    }


}