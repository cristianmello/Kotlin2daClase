package com.example.kotlin3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kotlin3.databinding.ActivityFormularioBinding
import com.example.kotlin3.databinding.ActivityMainBinding

class formulario : AppCompatActivity() {


    private lateinit var a: ActivityFormularioBinding
    val pessoa = pessoa(nombre = "", edad = 0, telefono = 0)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        a= ActivityFormularioBinding.inflate(layoutInflater)
        setContentView(a.root);

        a.enviar.setOnClickListener(View.OnClickListener {

            pessoa.setNome(a.nombre.text.toString())
            pessoa.setEdad(a.edad.text.toString().toInt())
            pessoa.setTelefono(a.telefono.text.toString().toInt())

        })

        a.limpiar.setOnClickListener(View.OnClickListener {
            a.nombre.setText("")
            a.edad.setText("")
            a.telefono.setText("")
        })

        a.mostrar.setOnClickListener(View.OnClickListener {
            a.nombre.setText(pessoa.getNombre().toString())
            a.edad.setText(pessoa.getEdad().toString())
            a.telefono.setText(pessoa.getTelefono().toString())
        })
    }

}