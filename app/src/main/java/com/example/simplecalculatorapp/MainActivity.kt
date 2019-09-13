package com.example.simplecalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNum = findViewById<EditText>(R.id.firstNumEditText)
        val secNum = findViewById<EditText>(R.id.secondNumEditText)
        val addBtn = findViewById<Button>(R.id.addButton)
        val resultTxtView = findViewById<TextView>(R.id.resultTextView)

        addBtn.setOnClickListener {
            resultTxtView.text = "Addition is "+(firstNum.text.toString().toInt()+secNum.text.toString().toInt()).toString()
            Toast.makeText(this,resultTxtView.text, Toast.LENGTH_LONG).show()
        }
    }
}
