package com.example.myapplication

fun main() {
    val num1 = 10
    val num2 = 3


    val sum = num1 + num2
    println("Addition: $num1 + $num2 = $sum")


    val difference = num1 - num2
    println("Subtraction: $num1 - $num2 = $difference")


    val product = num1 * num2
    println("Multiplication: $num1 * $num2 = $product")


    val quotient = num1 / num2
    println("Division: $num1 / $num2 = $quotient")

    // Modulus (Remainder)
    val remainder = num1 % num2
    println("Modulus: $num1 % $num2 = $remainder")

    // By using floating-point numbers
    val num3 = 10.0
    val num4 = 3.0
    val floatQuotient = num3 / num4
    println("Floating-point Division: $num3 / $num4 = $floatQuotient")


    //Assignment Operator
    var a = 10
    var b = 5

    println("Here am Initializing values:")
    println("a = $a")
    println("b = $b")


    a += b
    println("a += b: a = $a")

    a -= b
    println(" a -= b: a = $a")

    a *= b
    println("a *= b: a = $a")

    a /= b
    println(" a /= b: a = $a")

    a %= b
    println(" a %= b: a = $a")

    // Using a different variable for demonstration
    var c = 20
    c += 10
    println("c += 10: c = $c")
    c *= 2
    println("c *= 2: c = $c")


    //Unary Operator

    var number: Double = 7.6
    var isCheck: Boolean = true
    var result: Int = 4

    println("number = $number")
    println("-number = ${-number}")
    println("+number = ${+number}")

    println("--number = ${--number}")

    println("!isCheck = ${!isCheck}")

    println("result = $result")
    println("result++ = ${result++}")
    println("After result++: result = $result")


    //Equality and relational operator
    var no1: Int = 5
    var no2: Int = 5

    println("no1 = $no1")
    println("no2 = $no2")

    println("no1 == no2: ${no1 == no2}")
    println("no1 > no2: ${no1 > no2}")
    println("no1 < no2: ${no1 < no2}")
    println("no1 >= no2: ${no1 >= no2}")
    println("no1 <= no2: ${no1 <= no2}")
    println("no1 != no2: ${no1 != no2}")


    //Conditional operator
    val no3 = 15
    val no4 = 20

    if (no1 < no2 && no1 > 0) {
        println("Both conditions are true: no1 is less than no2 and no1 is greater than 0")
    }

    if (no1 > no2 || no2 > 0) {
        println("At least one condition is true: either no1 is greater than no2 or no2 is greater than 0")
    }

    if (no3 > no4 && no4 > no2) {
        println("Both conditions are true: no3 is greater than no4 and no4 is greater than no2")
    } else {
        println("The conditions for no3 and no4 are not satisfied.")
    }

    if (no1 < no3 || no2 < no4) {
        println("At least one condition is true: either no1 is less than no3 or no2 is less than no4")
    }



    var result1:Int=5+4*2
    println("Result="+result1)
    result1=(5+10)*5
    println("Result="+result1)
    var A1:Int=20
    var A2:Int=52
    var A3:Int=471
    var Sum:Int=0
    Sum=A1+--A2+--A3
    println("A1+ --A2+  --A3:::$Sum")
}


