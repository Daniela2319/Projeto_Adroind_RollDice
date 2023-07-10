package com.minhaempresa.dado

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImagem: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton: Button = findViewById(R.id.btn_botao)
        rollbutton.setOnClickListener{
           rollDice()

           // Toast.makeText(this,"Click no botão", Toast.LENGTH_SHORT).show() codígo parece mensagem instantanea
        }
        diceImagem = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        val randomInt  = Random().nextInt(6)+1 // código define o numero aleatório
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImagem.setImageResource(drawableResource)


    }
}