package com.renegade.aplicacion2024.firstapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.renegade.aplicacion2024.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        // Al arrancar la pantalla
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)
        // Recupera el texto del EditText
        // val strEtName = etName.text.toString()

        btnStart.setOnClickListener {
            Log.i("renegade","Botón pulsado ${etName.text.toString()}")
        }

    }
}