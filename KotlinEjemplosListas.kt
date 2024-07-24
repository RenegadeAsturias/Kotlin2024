package com.renegade.jetpackcompose

class KotlinEjemplosListas {

    // listasInmutables()
    // listasMutables()
}

private fun listasInmutables() {

    // Ejemplo de Lista inmutable
    val readOnlyWeekDays: List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println(readOnlyWeekDays.last())
    println(readOnlyWeekDays.first())

    val pruebaFiltro = readOnlyWeekDays.filter { it.contains("a") }
    println(pruebaFiltro)

    // Dos formas, utilizando 'it' como valor por defecto
    pruebaFiltro.forEach{ println(it) }
    // O también personalizando el nombre de la variable por el que necesite
    pruebaFiltro.forEach { dia -> println(dia) }

}

private fun listasMutables() {

    val diasSemana: MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    diasSemana.add("EjemploFin") // Por defecto se añade en la últma posición
    println(diasSemana)

    diasSemana.add(0, "EjemploPrimero") // Lo añade en la primera posición según el índice
    if(diasSemana.isNotEmpty()) {
        diasSemana.forEach { println("Día=$it") }
        diasSemana.forEach { dia -> println("Día=$dia") }
    }
}