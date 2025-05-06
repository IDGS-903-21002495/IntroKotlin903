package com.cielo.introkotlin903.temasKotlin

fun main(){
    var opcion = 0
    var num1 = 0
    var num2 = 0
    var resultado = 0
    do {
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("5. Salir")

        // Leer opción
        opcion = readln().toInt()

        if (opcion == 1){
            println("Ingrese el número 1:")
            num1 = readln().toInt()
            println("Ingrese el número 2:")
            num2 = readln().toInt()
            resultado = num1 + num2
            println("Resultado: $resultado")
        }else{
            if (opcion == 2){
                println("Ingrese el número 1:")
                num1 = readln().toInt()
                println("Ingrese el número 2:")
                num2 = readln().toInt()
                resultado = num1 - num2
                println("Resultado: $resultado")
            }else{
                if (opcion == 3){
                    println("Ingrese el número 1:")
                    num1 = readln().toInt()
                    println("Ingrese el número 2:")
                    num2 = readln().toInt()
                    resultado = num1 * num2
                    println("Resultado: $resultado")
                }else{
                    if (opcion == 4){
                        println("Ingrese el número 1:")
                        num1 = readln().toInt()
                        println("Ingrese el número 2:")
                        num2 = readln().toInt()
                        resultado = num1 / num2
                        println("Resultado: $resultado")
                    }
                }
            }
        }

    }while (opcion != 5)
}