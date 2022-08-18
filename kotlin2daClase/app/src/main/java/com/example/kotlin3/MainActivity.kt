package com.example.kotlin3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kotlin3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var a: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        a= ActivityMainBinding.inflate(layoutInflater)
        setContentView(a.root);

        a.button.setOnClickListener(View.OnClickListener {

            var campoNombre =  a.nombre.text
            var campoedad = a.edad.text.toString()

            if (campoNombre.toString().equals("cristian") && campoedad.toInt() == 20){
                startActivity(Intent(this,formulario::class.java))
            } else {
                Toast.makeText(this, "Los datos no son correctos", Toast.LENGTH_SHORT).show()
            }

        })

    }
}