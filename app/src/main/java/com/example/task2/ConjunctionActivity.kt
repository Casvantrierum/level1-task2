package com.example.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.task2.databinding.ActivityConjunctionBinding

class ConjunctionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConjunctionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConjunctionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        binding.btnSubmit.setOnClickListener { check() }
    }

    private fun check() {
        var countIncorrect = 0;

        var answer1 = binding.etTT.text.toString()
        var answer2 = binding.etTF.text.toString()
        var answer3 = binding.etFT.text.toString()
        var answer4 = binding.etFF.text.toString()

        if (answer1.capitalize() != "T") countIncorrect++
        if (answer2.capitalize() != "F") countIncorrect++
        if (answer3.capitalize() != "F") countIncorrect++
        if (answer4.capitalize() != "F") countIncorrect++

        if (countIncorrect > 0) onAnswerIncorrect(countIncorrect)
        else onAnswerCorrect()
    }

    /**
     * Displays a successful Toast message.
     */
    private fun onAnswerCorrect() {
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
    }

    /**
     * Displays an incorrect Toast message.
     */
    private fun onAnswerIncorrect(countIncorrect: Int) {
        Toast.makeText(this, getString(R.string.incorrect, countIncorrect), Toast.LENGTH_LONG).show()
    }




}