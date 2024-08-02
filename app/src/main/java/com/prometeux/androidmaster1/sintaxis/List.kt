package com.prometeux.androidmaster1.sintaxis

fun main() {
    mutableList()
}

fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    weekDays.add(0,"AlejandroDia")//add puede recibir tambien un index
  //  println(weekDays)

    if (weekDays.isEmpty()){
        println("La lista esta vacia")
    }else{
        weekDays.forEach{ println(it) }
    }

    if(weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }
    }

    weekDays.last()

    for(SUSCRIBETE in weekDays){
        println("Suscribete hoy $SUSCRIBETE"  )
    }

}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(readOnly.size)
    println(readOnly)
    println(readOnly[1])
    println(readOnly.last())
    println(readOnly.first())

    //FILTRAR
    val example = readOnly.filter { it.contains("a") }
    println(example)
//filter: itera en toda la lista, como un for
// it: iteracion

    //ITERAR
    readOnly.forEach{ println(it) }
    //otra version es la siguiente
    readOnly.forEach{ weekDay -> println(weekDay) }
}