package com.test.viewmodel

import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {
    var scoreTeamA = 0

    var scoreTeamB = 0

    override fun onCleared() {
        super.onCleared()
    }
}