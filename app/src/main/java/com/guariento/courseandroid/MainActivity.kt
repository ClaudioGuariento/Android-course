package com.guariento.courseandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_login).setOnClickListener {
            Toast.makeText(this, "Login invalido!", Toast.LENGTH_SHORT).show()
        }
        val button1 = findViewById<Button>(R.id.button_senha).setOnClickListener {
            Toast.makeText(this, "Esqueceu a Senha!", Toast.LENGTH_SHORT).show()
        }
    }
}