package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btnStart)
        val theName : EditText = findViewById(R.id.btnName)

        btnStart.setOnClickListener {
            if (theName.text.isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
            } else {

                Log.d("MainActivity", "Starting QuestionsMainActivity")

                val intent = Intent(this, QuestionsMainActivity::class.java)
                intent.putExtra(Constants.USER_NAME, theName.text.toString())
                startActivity(intent)


                Log.d("MainActivity", "Finished starting QuestionsMainActivity")

            }
        }

    }
}
