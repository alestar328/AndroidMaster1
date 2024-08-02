package com.prometeux.androidmaster1.sintaxis

fun main(){
    ifInt()
}

fun ifMultipleOR(){
    var pet = "dog"
    var isHappy = true

    if (pet == "dog" || (pet == "cat" && isHappy)){
        println("Es un gato o un perro")
    }
}



fun ifMultiple(){
    var age = 18
    var imHappy = true
    var parentPermission = false

    if(age>=18 && parentPermission && imHappy){
        println("Puedo beber cerveza")
    }
}

fun ifInt(){
    var age = 18

    if(age>=18){
        println("beber cerveza")
    }else{
        println("Beber un jugo")
    }
}

fun ifBoolean(){
    var soyFeliz:Boolean = false

    //sin nada = true
    // con ! al principio = false
    if(!soyFeliz){
        println("Estoy triste :(")
    }
}

fun ifAninado(){
    val animal = "dog"

    if(animal == "dog"){
        println("Es un perrito!!!")
    }else if(animal == "cat"){
        println("Es un gatito")
    } else if(animal == "bird"){
        println("Es un pajarito!!!")
    } else{
        println("No es uno de los animales esperados!!!")
    }
}


fun ifBasico(){
    val name = "Alejandro"

    if(name == "Alejandro"){
        println("Oye la variable name es Alejandro")
    }else{
        println("Este no es Alejandro")
    }
}