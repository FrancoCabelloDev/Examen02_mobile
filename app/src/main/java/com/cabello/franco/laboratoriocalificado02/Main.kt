package com.cabello.franco.laboratoriocalificado02

fun main() {
    val agenda = Agenda()
    while (true) {
        println(
            """
            |===== AGENDA DE CONTACTOS =====
            |1. Agregar contacto
            |2. Listar contactos
            |3. Buscar contacto
            |0. Salir
            """.trimMargin()
        )
        print("Elige opción: ")
        when (readLine()?.trim()) {
            "1" -> {
                print("Nombres: ")
                val nombres = readLine().orEmpty()
                print("Apellidos: ")
                val apellidos = readLine().orEmpty()
                print("Número: ")
                val numero = readLine().orEmpty()
                print("Carrera técnica: ")
                val carrera = readLine().orEmpty()

                agenda.agregar( Contacto(nombres, apellidos, numero, carrera) )
                println("-Contacto agregado.\n")
            }
            "2" -> {
                println("\n-- Lista completa de contactos --")
                agenda.listar().forEach { println(it) }
                println()
            }
            "3" -> {
                print("Nombre a buscar: ")
                val término = readLine().orEmpty()
                val resultados = agenda.buscarPorNombre(término)
                if (resultados.isEmpty()) {
                    println("→ No se encontró ningún contacto con “$término”.\n")
                } else {
                    println("\n-- Resultados de búsqueda --")
                    resultados.forEach { println(it) }
                    println()
                }
            }
            "0" -> {
                println("Saliendo de la agenda. ¡Hasta luego!")
                break
            }
            else -> {
                println("Opción inválida, inténtalo de nuevo.\n")
            }
        }
    }
}