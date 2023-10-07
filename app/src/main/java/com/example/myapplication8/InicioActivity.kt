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

    public fun Registrarse1(view: View) {
        val intent1 = Intent(this, Register::class.java);
        startActivity(intent1);
    }
    public fun IniciarSesion2(view: View){
        val intent2 = Intent(this, LoginActivity::class.java);
        startActivity(intent2)
    }



}