package com.edrthysrtsxample.buddtdrhgewfrawsergdrthdrthy.myhwapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun StartGame(view: View)
    {
        val IntentGame = Intent(this, GameActivity::class.java)
        startActivity(IntentGame)
    }
}
