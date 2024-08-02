package com.prometeux.androidmaster1.sintaxis

//VARIABLES
val age:Int = 28

fun main(){
    otro()
    showMyName()
    showMyAge(28)
    add(599,1)
    val mySubtract = subtract(10,5)
    println(mySubtract)

}

fun showMyName(){
    println("Mi nombre es Alejandro")
}
fun showMyAge(currentAge:Int = 28){ // se puede poner un valor por defecto
    println("Tengo $currentAge años")
}

fun add(firstNumer: Int, secondNumber:Int){
    println(firstNumer+secondNumber)
}

fun subtract(firstNumer: Int, secondNumber:Int): Int{ //se tiene que establecer que tipo variable retorna
   return firstNumer-secondNumber
}

fun subtractCool(firstNumer: Int, secondNumber:Int) = firstNumer - secondNumber //Forma de hacer funciones muy peques

fun otro(){
    val ejemplo321:String = age.toString()
    println(ejemplo321)
}

fun variablesBoolean(){
    /**
     * Variables Booleanas
     */
    //Boolean
    val booleanEjemplo:Boolean= true
    val booleanEjemplo1:Boolean= false

    println(booleanEjemplo)

}

fun alfaNumerica(){
    //Int desde -2 147 483 hasta 2 147 483 647
    val age2:Int = 28


    //Long -9 223 372 036 854 775 807 hasta 9 223 372 036 854 775 807
    val example:Long = 9223372036854775807

    //Float
    val floatEjemplo:Float = 30.6f

    //Double
    val doubleExample:Double = 3412.44545

    /**
     * Variables Alfanumericas
     */

    //Char
    val charEjemplo:Char = 'a'
    val charEjemplo1:Char = '2'
    val charEjemplo3:Char = '@'

    //String
    val stringEjemplo:String= "Alejandro"
    val stringEjemplo1:String= "545454545"
    println("Multiplicar")
    println(age *age2)
    println("Modulo")
    println(age %age2)

    //Concadenacion en String
    var stringConcatenada:String = "Hola"
    stringConcatenada = "Hola me llamo $stringEjemplo y tengo $age años"

    println(stringConcatenada)
}