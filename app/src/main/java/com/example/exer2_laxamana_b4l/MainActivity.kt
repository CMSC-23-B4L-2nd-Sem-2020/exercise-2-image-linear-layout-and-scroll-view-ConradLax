package com.example.exer2_laxamana_b4l

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var charImage : ImageView
    lateinit var bioData : TextView
    lateinit var startImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.start_button)
        rollButton.setOnClickListener { rollDice() }
        charImage = findViewById(R.id.character_image)
        bioData = findViewById(R.id.bio_text)

        val resetBtn: Button = findViewById(R.id.retry_button)
        resetBtn.setOnClickListener { reset() }
        startImage = findViewById(R.id.character_image)
    }

    private fun rollDice() {
        val randomInt = (1..6).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.kanbaru
            2 -> R.drawable.senjougahara
            3 -> R.drawable.nadeko
            4 -> R.drawable.tsukihi
            5 -> R.drawable.shinobu
            6 -> R.drawable.kissshot
            7 -> R.drawable.karen
            8 -> R.drawable.hachikuji
            9 -> R.drawable.ononoki
            else -> R.drawable.hanekawa
        }

        val bio_Resource = when(randomInt){
            1 -> R.string.kanbaru_data
            2 -> R.string.senjougahara_data
            3 -> R.string.nadeko_data
            4 -> R.string.tsukihi_data
            5 -> R.string.shinobu_data
            6 -> R.string.kissshot_data
            7 -> R.string.karen_data
            8 -> R.string.hachikuji_data
            9 -> R.string.ononoki_data
            else -> R.string.hanekawa_data
        }
        charImage.setImageResource(drawableResource)
        bioData.setText(bio_Resource)
    }

    private fun reset(){
        startImage.setImageResource(R.drawable.start_img)
        bioData.setText(R.string.bio_text)
    }
}
