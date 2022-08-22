package com.guariento.courseandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.guariento.courseandroid.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var usuario = Usuario(
            nome = "Claudio",
            email = "vnt",
            senha = "123"
        )

        binding.buttonLogin.setOnClickListener {
            if (binding.email.text.toString() == usuario.email && binding.senha.text.toString() == usuario.senha){
                val intent = Intent(this,Tela_Principal::class.java)
                startActivity(intent)
            } else{
                Toast.makeText(this, "Usuário ou Senha Incorreto", Toast.LENGTH_SHORT).show()
            }
        }
    }
}