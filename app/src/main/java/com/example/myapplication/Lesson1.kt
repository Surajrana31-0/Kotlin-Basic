package com.example.myapplication

fun main(){
    var A:Boolean= true
    var B:Int=22
    var C:Float=10.2f
    var D: Double=19.20
    var E:Char='S'
    var F:String="Suraj"
    var G:Byte=5
    var H:Short=-1112


    println("Hello my name is $F and I am $B years old.")
    println(A)
    println(B)
    println(C)
    println(D)
    println(E)
    println(F)
    println(G)
    println(H)

    //Type conversion in kotlin
    //Double>Float>Long>Integer>Short>Byte
    var I: Int = C.toInt()
    var J: Byte= I.toByte()
    println(I)
    println(J)
}