package com.test.viewmodel

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateScoreA()
        updateScoreB()

        add_score_a.setOnClickListener { addScoreA() }

        add_score_b.setOnClickListener { addScoreB() }
    }

    private fun updateScoreA() {
        score_a.text = viewModel.scoreTeamA.toString()
    }

    private fun updateScoreB() {
        score_b.text = viewModel.scoreTeamB.toString()
    }

    private fun addScoreA() {
        viewModel.scoreTeamA = viewModel.scoreTeamA + 1
        updateScoreA()
    }

    private fun addScoreB() {
        viewModel.scoreTeamB = viewModel.scoreTeamB + 1
        updateScoreB()
    }
}
