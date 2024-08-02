package com.prometeux.androidmaster1.sintaxis

fun main() {


    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

   // println(weekDays.size)

    //Modificar valores
    weekDays[2] = "Caruso"
    //println(weekDays[2])

    //TAMAÑOS
    if(weekDays.size>=6) {
     //   println(weekDays[5])
    }    else {
     //   println("No hay más valores")
    }

    //BUCLES para arrays
    for(position in weekDays.indices){
        //println("He pasado por aqui $position")
     //   println(weekDays[position])
    }

    for((position, value) in weekDays.withIndex()){
      //  println("La posicion $position, contiene $value")
    }

    for (weekDay in weekDays){
        println("Ahora es $weekDay")
    }
}