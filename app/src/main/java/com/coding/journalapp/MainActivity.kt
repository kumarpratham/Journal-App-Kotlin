package com.coding.journalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.coding.journalapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btnLogin.setOnClickListener {

        }
        binding.btnCreate.setOnClickListener {
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }


    }
}