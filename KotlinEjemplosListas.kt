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
