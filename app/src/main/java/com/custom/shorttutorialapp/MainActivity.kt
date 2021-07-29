package com.custom.shorttutorialapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCustomEditText.setOnClickListener {
            startActivity(Intent(this, CustomEdittextActiviity::class.java))
        }

        btnCustomRadioButton.setOnClickListener {
            startActivity(Intent(this,CustomRadioButtonActivity::class.java))
        }
    }
}