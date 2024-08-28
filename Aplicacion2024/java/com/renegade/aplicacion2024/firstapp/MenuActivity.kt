package com.renegade.aplicacion2024.firstapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.renegade.aplicacion2024.R

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnAppSaludar = findViewById<AppCompatButton>(R.id.btnAppSaludar)
        val btnAppIMC = findViewById<AppCompatButton>(R.id.btnAppIMC)
        val btnAppTODO = findViewById<AppCompatButton>(R.id.btnAppTODO)

        btnAppSaludar.setOnClickListener {
            val intentAppSaludar = Intent(this, FirstAppActivity::class.java)
            startActivity(intentAppSaludar)
        }

        btnAppIMC.setOnClickListener {
            val intentAppImc = Intent(this, ImcAppActivity::class.java)
            startActivity(intentAppImc)
        }

        btnAppTODO.setOnClickListener {
            val intentAppTodo = Intent(this, TodoActivity::class.java)
            startActivity(intentAppTodo)
        }

    }
}