package com.example.quizapp

import Question
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class QuestionsMainActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question> = ArrayList()
    private var mSelectedOptionPosition: Int = 0
    private var mUserName : String? = null


    private var progressBar: ProgressBar? = null
    private var progressNumber: TextView? = null
    private var theQuestion: TextView? = null
    private var optionOne: TextView? = null
    private var optionTwo: TextView? = null
    private var optionThree: TextView? = null
    private var optionFour: TextView? = null
    private var btnSubmit: Button? = null

    private val userAnswers = mutableMapOf<Int, Int>()

    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions_main)

        mUserName = intent.getStringExtra(Constants.USER_NAME)
        progressBar = findViewById(R.id.progress_bar)
        progressNumber = findViewById(R.id.progress_number)
        theQuestion = findViewById(R.id.question1)
        optionOne = findViewById(R.id.option1)
        optionTwo = findViewById(R.id.option2)
        optionThree = findViewById(R.id.option3)
        optionFour = findViewById(R.id.option4)
        btnSubmit = findViewById(R.id.btn_submit12)

        optionOne?.setOnClickListener(this)
        optionTwo?.setOnClickListener(this)
        optionThree?.setOnClickListener(this)
        optionFour?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

        mQuestionList = Constants.getQuestions()

        setQuestion()
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion() {
        defaultOptionsView()
        val question = mQuestionList[mCurrentPosition - 1]
        progressBar?.progress = mCurrentPosition
        progressNumber?.text = "$mCurrentPosition /${progressBar?.max}"
        theQuestion?.text = question.question
        optionOne?.text = question.option1
        optionTwo?.text = question.option2
        optionThree?.text = question.option3
        optionFour?.text = question.option4

        if (mCurrentPosition == mQuestionList.size) {
            btnSubmit?.text = "FINISH"
        } else {
            btnSubmit?.text = "SUBMIT"
        }
    }

    @SuppressLint("ResourceType")
    private fun defaultOptionsView() {
        val options = listOf(optionOne, optionTwo, optionThree, optionFour)
        for (option in options) {
            option?.let {
                it.setTextColor(ContextCompat.getColor(this, R.color.teal_700))
                it.typeface = android.graphics.Typeface.DEFAULT
                it.background = ContextCompat.getDrawable(this, R.drawable.options)
                it.invalidate()
                it.requestLayout()
            }
        }
    }

    private fun selectedOptionsView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(ContextCompat.getColor(this, R.color.white))
        tv.setTypeface(tv.typeface, android.graphics.Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.options)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.option1 -> {
                optionOne?.let { selectedOptionsView(it, 1) }
            }
            R.id.option2 -> {
                optionTwo?.let { selectedOptionsView(it, 2) }
            }
            R.id.option3 -> {
                optionThree?.let { selectedOptionsView(it, 3) }
            }
            R.id.option4 -> {
                optionFour?.let { selectedOptionsView(it, 4) }
            }
            R.id.btn_submit12 -> {
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++
                    if (mCurrentPosition <= mQuestionList.size) {
                        setQuestion()
                    } else {

                        val score = calculateScore()
                        val intent = Intent(this, ResultsMainActivity::class.java)
                        intent.putExtra(Constants.USER_NAME, mUserName)
                        intent.putExtra("SCORE", score)
                        startActivity(intent)
                        finish()
                    }
                } else {
                    val question = mQuestionList[mCurrentPosition - 1]

                    userAnswers[mCurrentPosition - 1] = mSelectedOptionPosition

                    if (question.answer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option)
                    }
                    answerView(question.answer, R.drawable.correct_option)

                    if (mCurrentPosition == mQuestionList.size) {
                        btnSubmit?.text = "FINISH"
                    } else {
                        btnSubmit?.text = "GO TO THE NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> optionOne?.background = ContextCompat.getDrawable(this, drawableView)
            2 -> optionTwo?.background = ContextCompat.getDrawable(this, drawableView)
            3 -> optionThree?.background = ContextCompat.getDrawable(this, drawableView)
            4 -> optionFour?.background = ContextCompat.getDrawable(this, drawableView)
        }
    }

    private fun calculateScore(): Int {
        var score = 0
        for ((index, selectedAnswer) in userAnswers) {
            val question = mQuestionList[index]
            if (question.isAnswerCorrect(selectedAnswer)) {
                score++
            }
        }
        return score
    }
}
