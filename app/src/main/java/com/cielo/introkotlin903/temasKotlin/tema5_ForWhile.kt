package com.cielo.introkotlin903.temasKotlin

fun main(){
    /*
    Tiene una implementación similar al Range de Python
    1..4 = 1,2,3,4
    1..<4 = 1,2,3
    4 downTo 1 = 4,3,2,1
    1..5 step 2 = 1,3,5
    * Se pueden aplicar rangos para caracteres
    'a'..'z' = a,b,c,d,..,z
     */

    // Uso del for
    for (num in 1..5){
        println(num)
    }

    // Recorrer una lista de elementos
    val frutas = listOf("Manzana", "Pera", "Frambuesa", "Durazno")

    // Fruta corresponde a un elemento de la lista, mientra que frutas a la lista como tal
    for (fruta in frutas){
        println(fruta)
    }

    // Uso del While
    val n = 10
    var d = 0
    while (d<n){
        println(d)
        d++
    }

    /*
    Practica 3: Imprimir una piramide de * según el número dado por el usuario
    n = 5
    *
    **
    ***
    ****
    *****
    Cuando se capture un 0 terminar el programa, utilizando unicamente un Do - While

    Practica 4: Formula general, si la operación no es posible se vuelve a pedir los valores, si es posible recuperar el valor de x1 y x2
    * */
}