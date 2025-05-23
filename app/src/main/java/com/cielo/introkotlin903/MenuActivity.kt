package com.cielo.introkotlin903

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cielo.introkotlin903.ejemplo1.CinepolisActivity
import com.cielo.introkotlin903.practica1.SaludoActivity
import com.cielo.introkotlin903.practica2.OperasActivity
import com.cielo.introkotlin903.practica3.Ejemplo3Activity
import com.cielo.introkotlin903.practica4.ArchivosActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu2)
        val btnSaludo = findViewById<Button>(R.id.btn1)
        val btnCalcular = findViewById<Button>(R.id.btn2)
        val btnCinepolis = findViewById<Button>(R.id.btn3)
        val btnEjemplo3 = findViewById<Button>(R.id.btn4)
        val btnArchivos = findViewById<Button>(R.id.btn5)


        btnSaludo.setOnClickListener{
            navegateToSaludo()
        }

        btnCalcular.setOnClickListener {
            navegateToCalculo()
        }

        btnCinepolis.setOnClickListener {
            navegateToCinepolis()
        }

        btnEjemplo3.setOnClickListener {
            navegateToEjemplo3()
        }

        btnArchivos.setOnClickListener {
            navegateToArchivos()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navegateToArchivos(){
        val intent = Intent(this,ArchivosActivity::class.java)
        startActivity(intent)
    }

    private fun navegateToEjemplo3() {
        val intent = Intent(this,Ejemplo3Activity::class.java)
        startActivity(intent)
    }

    private fun navegateToCinepolis() {
        val intent = Intent(this,CinepolisActivity::class.java)
        startActivity(intent)
    }

    private fun navegateToCalculo() {
        val intent = Intent(this,OperasActivity::class.java)
        startActivity(intent)
    }

    private fun navegateToSaludo() {
        val intent = Intent(this,SaludoActivity::class.java)
        startActivity(intent)
    }
}