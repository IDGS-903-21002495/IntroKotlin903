package com.cielo.introkotlin903.temasKotlin

import kotlin.math.sqrt

/*
    Practica 4: Formula general, si la operación no es posible se vuelve a pedir los valores, si es posible recuperar el valor de x1 y x2
* */

fun main(){

    var a = 0
    var b = 0
    var c = 0
    var discriminante = 0.0
    var x1 = 0.0
    var x2 = 0.0

    do {
        println("Ingrese el valor de a, b y c respectivamente")
        a = readln().toInt()
        b = readln().toInt()
        c = readln().toInt()

        var exponente = Math.pow(b.toDouble(),2.0)
        discriminante = (exponente - 4*a*c).toDouble()

        if (discriminante < 0.0 || a == 0){
            println("No se puede realizar la operación, intente con otros valores")
        }

    }while (discriminante < 0.0 || a == 0)

    var raiz = sqrt(discriminante)
    x1 = (-b + raiz)/(2*a)
    x2 = (-b - raiz)/(2*a)

    println("Soluciones: x1 = $x1 y x2 = $x2")

}