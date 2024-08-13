package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultsMainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_results_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val score = intent.getIntExtra("SCORE", 0)
        val theName : TextView = findViewById(R.id.btnName)
        val resultMessage = findViewById<TextView>(R.id.result_message)

        theName.text = intent.getStringExtra(Constants.USER_NAME)
        resultMessage.text = "Your score: $score/18"

        val restartButton: Button = findViewById(R.id.btn_restart)
        restartButton.setOnClickListener {
            val intent = Intent(this, QuestionsMainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
