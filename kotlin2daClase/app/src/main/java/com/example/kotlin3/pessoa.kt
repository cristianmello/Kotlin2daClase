package com.example.kotlin3

class pessoa {

    private var nombre:String = ""
    private var edad:Int = 0
    private var telefono:Int = 0


    constructor(nombre:String,  edad: Int,  telefono: Int) {
        this.nombre = nombre
        this.edad = edad
        this.telefono = telefono
    }

    fun getNombre(): String {
        return this.nombre
    }

    fun setNome(nombre : String){
        this.nombre = nombre
    }


    fun getEdad(): Int {
        return this.edad
    }

    fun setEdad(edad : Int){
        this.edad = edad
    }

    fun getTelefono(): Int {
        return this.telefono
    }

    fun setTelefono(telefono : Int){
        this.telefono = telefono
    }





}