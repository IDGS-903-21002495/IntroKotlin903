package com.cielo.introkotlin903.temasKotlin

// Creación de clases en Kotlin
class Usuarios() {
    // Definición de un atributo
    val materia: String = ""

}

// Como tal no existen los constructures, sino que funciona como una función.
// Cuando se haga la instancia se tendran que pasar tambien los parametros.
class Usuarios2(val id: Int, val nombre: String) {
    val materia: String = ""

    // Se pueden agregar funciones para las clases
    fun hola(){
        println("Hola $nombre")
    }

}

fun main(){
    val alumno = Usuarios()
    val alumno2 = Usuarios2(1, "Carlos")

    // Para hacer referencia a las propiedades de la clase
    println(alumno2.id)
    println(alumno2.nombre)
    alumno2.hola()
}