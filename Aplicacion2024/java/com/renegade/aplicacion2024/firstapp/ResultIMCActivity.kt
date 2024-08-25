package com.renegade.aplicacion2024.firstapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.renegade.aplicacion2024.R
import com.renegade.aplicacion2024.firstapp.ImcAppActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {

    private lateinit var tvIMC:TextView
    private lateinit var tvResult:TextView
    private lateinit var tvDescription:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imcactivity)
        val result:Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponents()
        initUI(result)
    }

    private fun initComponents() {
        tvIMC = findViewById(R.id.tvIMC)
        tvResult = findViewById(R.id.tvResult)
        tvDescription = findViewById(R.id.tvDescription)
    }

    private fun initUI(result: Double) {
        tvIMC.text = result.toString()
        when(result) {
            in 0.00..18.50 -> { // Bajo peso
                tvResult
                tvDescription
            }
            in 18.51..24.99 -> { // Peso normal
                tvResult
                tvDescription
            }
            in 25.00..29.99 -> { // Sobrepeso
                tvResult
                tvDescription
            }
            in 30.00..99.00 -> { // Obesidad
                tvResult
                tvDescription
            }
            else -> { // error
                tvIMC.text = "error"
                tvResult.text = "error"
                tvDescription.text = "error"
            }
        }
    }

}