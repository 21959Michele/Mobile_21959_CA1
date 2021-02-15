package com.misousa.mobile002_21959_ca1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.misousa.mobile002_21959_ca1.R.id.textResult

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

             val edNumber1 = findViewById<EditText>(R.id.edNumber1)
             val edNumber2 = findViewById<EditText>(R.id.edNumber2)
             val textResult = findViewById<TextView>(textResult)
             val btnAdd = findViewById<Button>(R.id.btnAdd)


         btnAdd.setOnClickListener {

             val firstNumber = edNumber1.text.toString().toInt()
             val secNumber = edNumber2.text.toString().toInt()
             val total = firstNumber + secNumber

             textResult.setText(total.toString())
         }

        }
    }
