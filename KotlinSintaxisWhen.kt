package com.renegade.jetpackcompose

class KotlinBasicoSintaxisWhen {
//    getMonth(1)
//    getMonth(12)
//    getTrimestre(1)
//    getTrimestre(3)
//    getSemestre(1)
//    getSemestre(8)
//    getSemestre(15)
//    result(10) // Int
//    result("Holamundo!") // String
//    result(true)
//    result(false)
}

private fun getMonth(month:Int){
    println("MES SELECCIONADO = ${month.toString()}")
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> {
            println("Noviembre")
            println("Noviembre")
        }
        12 -> println("Diciembre")
        else -> println("No es un mes válido")
    }
}

private fun getTrimestre(month:Int){
    when(month){
        1, 2, 3 -> print("Primer trimestre")
        4, 5, 6 -> print("Segundo trimestre")
        7, 8, 9 -> print("Tercer trimestre")
        10, 11, 12 -> print("Cuarto trimestre")
        else -> print("Trimestre no valido")
    }
}

fun getSemestre(month: Int) = when(month){
    in 1..6 ->    println("Primer semestre")
    in 7..12 ->   println("Segundo semestre")
    !in 1..12 ->  println("Semestre no válido")
    else ->  println("No va a pasar")
}

fun result(value:Any){
    when(value){
        is Int -> println("SUMA($value+$value)="+(value.toInt()+ value.toInt()))
        is String -> println("Es un String=$value")
        is Boolean -> if(value) println("Es boolean=$value")
    }
}
