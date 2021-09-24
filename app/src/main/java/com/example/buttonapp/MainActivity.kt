package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView

  class MainActivity : AppCompatActivity() {
    lateinit var plus : Button
    lateinit var minus : Button
     lateinit  var  lbl : TextView
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lbl = findViewById(R.id.tvTextView)
        plus = findViewById(R.id.plus)
        minus = findViewById(R.id.minus)

        var getNum = lbl.text.toString()
        plus.setOnClickListener{(add())}

        minus.setOnClickListener{(minus())}

    }

    fun add(){

        count += 1
        lbl.text = count.toString()
        // count.toString().also { lbl.text = it }
        if (count > 0){
            lbl.setTextColor(Color.parseColor("#8BC34A"))
        }
        if (count == 0){
            lbl.setTextColor(Color.parseColor("#000000"))
        }
    }
    fun minus() {
        count -= 1
        lbl.text = count.toString()

        if (count < 0){
            lbl.setTextColor(Color.parseColor("#FF0000"))
        }
        if (count == 0){
            lbl.setTextColor(Color.parseColor("#000000"))
        }
    }

}