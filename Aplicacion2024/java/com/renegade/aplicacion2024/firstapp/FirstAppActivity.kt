package com.renegade.aplicacion2024.firstapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.renegade.aplicacion2024.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        // Al arrancar la pantalla
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        btnStart.setOnClickListener {
            Log.i("renegade","Botón pulsado")
        }
    }
}