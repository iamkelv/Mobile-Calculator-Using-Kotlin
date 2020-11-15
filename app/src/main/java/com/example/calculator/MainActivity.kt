package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun numberEvent(view: View) {
        var buClick = editText.text.toString()
        var buSelect: Button = view as Button
        when (buSelect.id) {
            bu1.id -> {
                buClick += "1"
            }
            bu2.id -> {
                buClick += "2"
            }
            bu3.id -> {
                buClick += "3"
            }
            bu4.id -> {
                buClick += "4"
            }
            bu5.id -> {
                buClick += "5"
            }
            bu6.id -> {
                buClick += "6"
            }
            bu7.id -> {
                buClick += "7"
            }
            bu8.id -> {
                buClick += "8"
            }
            bu9.id -> {
                buClick += "9"
            }
            bu0.id -> {
                buClick += "0"
            }
        }
        editText.setText(buClick)
    }
}