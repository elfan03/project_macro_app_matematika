package com.example.matematika_fun_project_macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Berhasilbuatakunn : AppCompatActivity() {
    private lateinit var buttonkembalikehome: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berhasilbuatakunn)
        buttonkembalikehome=findViewById(R.id.btnkembalikehome)
        buttonkembalikehome.setOnClickListener {
            startActivity(Intent(this,Halamanlogin::class.java))
        }
    }
}