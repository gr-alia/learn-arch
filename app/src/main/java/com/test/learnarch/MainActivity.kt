package com.test.learnarch

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("ScoreTest", "MainActivity:onCreate")

        var scoreFragment: ScoreFragment? = supportFragmentManager.findFragmentByTag("ScoreFragment") as ScoreFragment?

        if (scoreFragment == null){
            scoreFragment = ScoreFragment.newInstance()
            scoreFragment.arguments = intent.extras
            val transaction = supportFragmentManager.beginTransaction()
            transaction.add(R.id.fragment_container, scoreFragment, "ScoreFragment")
            transaction.commit()
        }

    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("ScoreTest", "MainActivity:onDestroy")

    }
}
