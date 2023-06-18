package com.unand.smart_showroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class SpashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spash)

        //declare the animation
        val stb = AnimationUtils.loadAnimation(this, R.anim.stb)
        val ttb = AnimationUtils.loadAnimation(this, R.anim.ttb)

        val logoSm = findViewById(R.id.logoSm) as ImageView
        val textSm = findViewById(R.id.textSm) as TextView

        logoSm.startAnimation(stb)
        textSm.startAnimation(ttb)

        Handler().postDelayed(Runnable {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 2000)
    }
}