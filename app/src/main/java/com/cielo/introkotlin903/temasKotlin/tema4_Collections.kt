package com.cielo.introkotlin903.temasKotlin

fun main(){
    /*
    List: Listas ordenadas que permiten duplicados (el valor permanece como una constante)
    MutableList: Son mutables, si cambian
    Set: Solo permite valores unicos
    MutableSet: Son mutables, si cambian
    Map: Son como diccionarios, asignamos valores haciendo referencia a su clave - valor
    MutableMap: Son mutables, si cambian.
    */

    // Especificamos el tipo de dato que va a contener la lista
    var lista = listOf<String>("Lunes", "Martes", "Miercoles")
    // Imprimir lista
    println(lista)
    println(lista.size) // Imprimir tamaño de la lista
    println(lista.get(0)) // Obtener el primer elemento
    println(lista[1]) // Imprimir el segundo valor segun la posición de este en la lista
    println(lista.indexOf("Miercoles")) // Obtener el indice el elemento "Miercoles"
    println(lista.first()) // Obtener el primer elemento de la lista
    println(lista.last()) // Obtener el ultimo elemento de la lista

    // Lista mutable
    var listaMutable = mutableListOf<String>("Lunes", "Martes", "Miercoles")
    println(listaMutable)
    listaMutable.add("Jueves") // Añadir el elemento jueves
    println(listaMutable)
    listaMutable.removeAt(0) // Remover el elemento en la posición 0
    println(listaMutable)
    listaMutable.add(0,"Domingo") // Añadir el elemento Domingo en la posición 0
    println(listaMutable)
    listaMutable.remove("Miercoles") // Eliminar el elemento Miercoles
}