package com.cielo.introkotlin903.temasKotlin
/*
    Practica 3: Imprimir una piramide de * según el número dado por el usuario
    n = 5
    *
    **
    ***
    ****
    *****
    Cuando se capture un 0 terminar el programa, utilizando unicamente un Do - While

*/

fun main(){
    do {
        println("Especifique el tamaño de la piramide: ")
        var n = readln().toInt()
        var piramide = 0
        var caracter = ""

        do {
            caracter+="*"
            println(caracter)
            piramide++
        }while (piramide < n)

    }while (n != 0)
}