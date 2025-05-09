package com.cielo.introkotlin903.temasKotlin

fun main(){
    println("Ingrese el sueldo del empleado:")
    // readln permite leer un valor leyendolo desde consola
    val sueldo = readln().toDouble()

    if(sueldo > 3000){
        println("Debe pagar impuestos")
    }else{
        println("No debe pagar impuestos")
    }

    val mes = "1"
    when(mes){
        "1" -> println("Enero")
        "2" -> println("Febrero")
        "3" -> println("Marzo")
        "4" -> println("Abril")
        else -> println("Mes no válido")
    }

    print(1..5)
}