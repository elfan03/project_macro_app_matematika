package com.example.matematika_fun_project_macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class BuatAkun : AppCompatActivity() {
    private lateinit var buttonmasuk: Button
    private lateinit var buttonmendaftar: Button
    private lateinit var tvmasuk: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buat_akun)
        buttonmasuk=findViewById(R.id.btnmasuk)
        buttonmendaftar=findViewById(R.id.btnmendaftar)
        tvmasuk=findViewById(R.id.tvmasuk)

        buttonmasuk.setOnClickListener {
            startActivity(Intent(this,Halamanlogin::class.java))
        }
        buttonmendaftar.setOnClickListener {
            startActivity(Intent(this,Berhasilbuatakunn::class.java))
        }
        tvmasuk.setOnClickListener {
            startActivity(Intent(this,Halamanlogin::class.java))
        }

    }
}