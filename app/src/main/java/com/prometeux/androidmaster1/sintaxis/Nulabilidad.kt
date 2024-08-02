package com.prometeux.androidmaster1.sintaxis

fun main(){

    var name:String? = null

  //  println(name!![3])//te aseguras de que el valor de la variable no es nulo
   // println(name!!.get(2))
    println(name?.get(1)?: "Es nulo GIL")
}