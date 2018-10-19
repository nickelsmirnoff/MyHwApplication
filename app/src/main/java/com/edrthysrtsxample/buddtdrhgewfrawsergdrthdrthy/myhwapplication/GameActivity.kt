package com.edrthysrtsxample.buddtdrhgewfrawsergdrthdrthy.myhwapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        button2.setOnClickListener {
            iClickCount++;
            textViewCount.text = iClickCount.toString()
        }
        RunTimeCount()
    }

    private var iClickCount: Int = 0
    private var iSecondsLeft: Int = 10

    fun RunTimeCount(){
        object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long)
            {
                iSecondsLeft--
                textViewTimeleft.text = "0:0"+iSecondsLeft.toString();
            }
            override fun onFinish()
            {
                textViewTimeleft.text = "0:00"
                val IntentResult = Intent(this@GameActivity, ResultActivity::class.java)
                IntentResult.putExtra ("count", iClickCount)
                startActivity(IntentResult)
            }
        }.start()
    }
}
