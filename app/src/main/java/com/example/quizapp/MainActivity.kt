package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_start : Button = findViewById(R.id.btnStart)
        val btn_name : EditText = findViewById(R.id.btnName)

        btn_start.setOnClickListener {
            if (btn_name.text.isEmpty()) {
                Toast.makeText(this,
                    "Please enter your name", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, QuestionsMainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
