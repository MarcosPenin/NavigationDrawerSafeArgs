package com.example.navigationdrawertest

class Persona( val nombre:String, val apellidos:String,  val edad:Int) {

    override fun toString(): String {
        return "$nombre,$apellidos,${edad.toString()}"
    }

}
