package com.example.matematika_fun_project_macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Home : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnQuiz: Button = findViewById(R.id.btn_quiz)
        btnQuiz.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_quiz ->{
                val intent = Intent(this@Home, MenuQuiz::class.java)
                startActivity(intent)
            }
        }
    }
}