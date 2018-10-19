package com.edrthysrtsxample.buddtdrhgewfrawsergdrthdrthy.myhwapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*


class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val count:Int= intent.getIntExtra("count",0)
        textView3.text = count.toString()


        when (count) {
            in 0..14 -> textView4.text = "Это плохо"
            in 15..29 -> textView4.text = "Это хорошо"
            else -> textView4.text = "Это отлично"
            }
    }

    fun Restart(view: View)
    {
        val IntentGame= Intent(this@ResultActivity, GameActivity::class.java)
        startActivity(IntentGame)
    }
}
