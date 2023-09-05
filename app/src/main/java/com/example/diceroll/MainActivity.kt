package com.example.diceroll

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceImages = arrayOf(
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6
        )

        rollButton.setOnClickListener {
            rollDice(diceImages)
        }
    }

    private fun rollDice(diceImages: Array<Int>) {
        val random = Random()
        val diceNumber = random.nextInt(6) // Generates a random number between 0 and 5
        val drawableResource = diceImages[diceNumber]
        diceImageView.setImageResource(drawableResource)
    }
}
