package com.coding.journalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var intent = Intent(this,MainActivity::class.java)

        @Suppress("DEPRECATION")
        Handler().postDelayed({
            startActivity(intent)
        },3000)
    }
}