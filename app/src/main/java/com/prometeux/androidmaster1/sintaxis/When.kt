package com.prometeux.androidmaster1.sintaxis

fun main(){

    resutado(true)
}
fun resutado(value:Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) print ("Hola bebe")
    }
}

fun getSemester(month:Int){
    when(month){
        //RANGOS NUMERICOS
        in 1..6 -> println("Primer semestre")
        in 7 .. 12 -> println("Segundo semestre")
        !in 1..12 -> println("Semestre NO valido")
        //else -> println("Semestre NO valido")
    }
}

fun getTrimester(month:Int){
    when(month){
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6 -> println("Segundo trimestre")
        7, 8, 9 -> println("Tercer trimestre")
        10, 11, 12 -> println("Cuarto trimestre")
        else -> println("Trimestre no valido")
    }
}

// FUNCION MEJORADA CON RETURN
fun getTrimester2(month:Int) = when(month){
        1, 2, 3 -> "Primer trimestre"
        4, 5, 6 -> "Segundo trimestre"
        7, 8, 9 -> "Tercer trimestre"
        10, 11, 12 -> "Cuarto trimestre"
        else -> "Trimestre no valido"
    }

fun getMonth(month: Int){
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
            println("Mes de cachudos")
        }
        12 -> println("Diciembre")
        else -> println("No es un mes valido")
    }
}

