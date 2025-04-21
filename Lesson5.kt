package com.example.myapplication

fun main(){
    //if -else statement
    print("Please enter a number: ")
    var number1: Any = readln()!!.toInt()

    if (number1.toString().toInt() % 2 == 0) {
        println("$number1 is even")
    } else {
        println("$number1 is odd")
    }

//If=else-if laddes
    print("Enter your marks: ")
    val marks = readln()!!.toInt()

    if (marks >= 90) {
        println("Grade: A+")
    } else if (marks >= 80) {
        println("Grade: A")
    } else if (marks >= 70) {
        println("Grade: B")
    } else if (marks >= 60) {
        println("Grade: C")
    } else {
        println("Grade: F")
    }
//Nested if
    print("Enter a number: ")
    val number = readln()!!.toInt()

    if (number >= 0) {
        if (number % 2 == 0) {
            println("\$number is a positive even number")
        } else {
            println("\$number is a positive odd number")
        }
    } else {
        println("\$number is negative")
    }

    //When statement
    print("Enter a number between 1 and 5: ")
    val number3 = readln()!!.toInt()

    when (number3) {
        1 -> println("You selected One")
        2 -> println("You selected Two")
        3 -> println("You selected Three")
        4 -> println("You selected Four")
        5 -> println("You selected Five")
        else -> println("Invalid number")
    }

    //For loop
    for (i in 1..5) {
        println(i)
    }

//Adding sum
    var sum = 0

    for (i in 1..5) {
        sum += i
    }

    println("The sum of numbers from 1 to 5 is: $sum")
//Accessing data through index
    val vehicle = arrayListOf<String>("Tata", "Kia", "Hyundai", "MG")
    for (y in vehicle.indices) {
        println("The value in $y index is : - ${vehicle[y]}")
    }


    //For-each loop
    val vehicle1= arrayListOf<String>("Tata", "Kia", "Hyundai", "MG")

    vehicle1.forEach{ it: String ->
        println(it)
    }
    val carBrands = arrayListOf<String>("Tata", "Kia", "Hyundai", "MG")

    var i = 0
    while (i < carBrands.size) {
        println(carBrands[i])
        i++
    }
}
