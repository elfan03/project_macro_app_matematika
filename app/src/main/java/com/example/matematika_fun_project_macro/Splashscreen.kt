package com.example.matematika_fun_project_macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
            val intent = Intent(this@Splashscreen, Halamanlogin::class.java)
            startActivity(intent)
            finish()
        }
    }
}