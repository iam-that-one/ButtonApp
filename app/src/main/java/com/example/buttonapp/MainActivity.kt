package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var plus : Button
    lateinit var minus : Button
    lateinit var  lbl : TextView
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lbl = findViewById(R.id.tvTextView)
        plus = findViewById(R.id.plus)
        minus = findViewById(R.id.minus)

        plus.setOnClickListener{(add())}
        minus.setOnClickListener{(minus())}
    }

    fun add(){
        count = count + 1
      lbl.setText(count.toString())
    }
    fun minus(){
        count = count - 1
        lbl.setText(count.toString())
    }
}