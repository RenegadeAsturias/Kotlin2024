package com.renegade.jetpackcompose

class KotlinEjemplosArrays {

    // ejemplos()
}

private fun ejemplos() {

    val weekDays = arrayOf<String>("Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo")

    for(posicion in weekDays.indices) {
        println("[weekDays.indices]weekDays[$posicion]="+weekDays[posicion])
    }

    for((position,value) in weekDays.withIndex()) {
        println("[weekDays.withIndex()]weekDays[$position]=$value")
    }

    for(day in weekDays) {
        println("[day in weekDays]Hoy es=$day")
    }

}
