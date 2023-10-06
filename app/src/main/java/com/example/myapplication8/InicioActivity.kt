package com.example.myapplication8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
    }

    public fun Registrar(view: View) {
        val intent = Intent(this, Register::class.java);
        startActivity(intent);
    }
    public fun IniciarSesion(view: View){
        val intent = Intent(this, LoginActivity::class.java);
        startActivity(intent)
    }



}