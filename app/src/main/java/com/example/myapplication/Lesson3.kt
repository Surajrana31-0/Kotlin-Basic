package com.example.myapplication



fun main() {
    // Immutable list
    val numbers: List<String> = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers[2]}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\": ${numbers.indexOf("two")}")

    // Immutable list example
    val list = listOf("Apple", "Mango", "Banana", "Onion")
    println("Hommy")
    for (i in list.indices) {
        println(list[i])
    }
    println()

    // Mutable list example
    val mutableList = mutableListOf("One", "two", "three")
    mutableList.add("Four")
    println("You are ok")
    for (i in mutableList.indices) {
        println(mutableList[i])
    }

    // Set example
    val numberSet = setOf(1, 2, 3, 4)
    for (element in numberSet) {
        println(element)
    }

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numberSet == numbersBackwards}")

    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Delhi"
    )

    println("Keys: ${countriesCapitals.keys}")
    println("Values: ${countriesCapitals.values}")

    // Corrected line to access Nepal's capital
    println("Nepal's capital is: ${countriesCapitals["Nepal"]}")

    // Immutable map
    val studentMarks = mapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45
    )

    print("Enter student name: ")
    val input = readln().lowercase()
    println(studentMarks[input])

    // Mutable map
    val mutableStudentMarks = mutableMapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45
    )

    mutableStudentMarks["ram"] = 60
    mutableStudentMarks["sabin"] = 80

    print("Enter student name: ")
    val inputMutable: String = readln().lowercase()

    println(mutableStudentMarks[inputMutable])
}