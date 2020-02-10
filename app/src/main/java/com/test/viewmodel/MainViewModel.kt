package com.test.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {
    var scoreTeamA = 0

    var scoreTeamB = 0

    override fun onCleared() {
        super.onCleared()
        Log.d("ScoreTest", "ViewModel:onCleared")

    }
}