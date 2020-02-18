package com.test.learnarch

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import kotlinx.android.synthetic.main.score_fragment.*


class ScoreFragment : Fragment() {

    companion object {
        fun newInstance() = ScoreFragment()
    }

    private  val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ScoreTest", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("ScoreTest", "onCreateView")

        return inflater.inflate(R.layout.score_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("ScoreTest", "onActivityCreated")

        //  viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("ScoreTest", "onViewCreated")

        updateScoreA()
        updateScoreB()

        add_score_a.setOnClickListener { addScoreA() }

        add_score_b.setOnClickListener { addScoreB() }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("ScoreTest", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ScoreTest", "onDestroy")
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
