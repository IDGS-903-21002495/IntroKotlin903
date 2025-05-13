package com.cielo.introkotlin903.temasKotlin

// Funciones: una función se define con la palabra fun seguido del nombre de la función
// Tenemos funcion de recibe y/o regresan uno o varios parametros.

fun suma(x: Int, y: Int): Int{
    return x + y
}

// Una manera más breve de hacer una función, es una función de linea
// Se le quita el tipo de valor que va a regresar y la palabra return, así como las llaves
fun suma2(x: Int, y: Int) = x + y

fun main(){
    println("------------------------------------------------------------------------")
    // Imprimir resultados de las funciones
    println(suma(2,5))
    println(suma2(3,7))
}
