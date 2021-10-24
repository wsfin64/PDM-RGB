package com.example.atividade_rgb

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private lateinit var cor: TextView
    private lateinit var layout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.cor = findViewById(R.id.tvCor)
        this.layout = findViewById(R.id.layout)
        this.cor.text = "Toque na tela para alterar a cor"

        this.layout.setOnClickListener{
            var geradorRGB = Cores()
            println(geradorRGB.getCorRGB())
            this.cor.text = "" + geradorRGB.getCorRGB()[0] + " " + geradorRGB.getCorRGB()[1] + " " + geradorRGB.getCorRGB()[2] + ""

            val corTela = Color.rgb(geradorRGB.getCorRGB()[0], geradorRGB.getCorRGB()[1],  geradorRGB.getCorRGB()[2])
            this.layout.setBackgroundColor(corTela)
        }
    }
}