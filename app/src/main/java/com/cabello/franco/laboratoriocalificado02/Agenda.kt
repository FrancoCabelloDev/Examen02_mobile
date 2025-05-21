package com.cabello.franco.laboratoriocalificado02

class Agenda {
    private val contactos = mutableListOf<Contacto>()

    fun agregar(contacto: Contacto) {
        contactos.add(contacto)
    }

    fun listar(): List<Contacto> =
        contactos.toList()

    fun buscarPorNombre(nombre: String): List<Contacto> =
        contactos.filter {
            it.nombres.contains(nombre, ignoreCase = true)
        }
}