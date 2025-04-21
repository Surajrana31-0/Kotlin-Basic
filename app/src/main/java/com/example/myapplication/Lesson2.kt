package com.example.myapplication

fun main(){// We can also include it inside the main->(args: Array<String>)
    var name = arrayOf("Ram","Shyam", "Hari"," Gita","Sita")
    println(name[1])
    name[1]="Rohit"
    println(name[1])
    println(name.size)

    //Similar for integer

    //We can add value directly in array while initializing variable
    var age = arrayListOf<Int>(1,2,5,8,100)//A should be a while adding the value directly
    age.add(150)
    println(age)
    age.add(1,500)
    println(age)

    //We can add the value to the variable only if it is initialize
    var age1= ArrayList<Int>()// A should be as it is (i.e Capital)
    age1.add(10)
    age1.add(20)
    age1.add(50)
    age1.add(100)
    age1.add(1025)
    println(age1)
    //We can add or remove using index or direct passing value
    age1.add(1,540)// It shift the value to the right.
    age1.removeAt(2)
    age1.remove(100)
    println(age1)

    //similar for String
    var name1=arrayListOf<String>("Ram", "Shyam","Rajib","Sandesh","Jeevan")
    println(name1)
    name1.add("Suraj")
    name1.add(1,"Sahin")//It also shifts the value to the right side of list
    println(name1)

    name1.remove("Rajib")
    println(name1)
    name1.removeAt(0)
    println(name1)


    //We can also do this for the different data type holding arrayList   ->var name1=arrayListOf<Any>(..............)
    var AList=arrayListOf<Any>("Suraj",100,58,32,"Suhil")
    println(AList)
    println(AList[0])
    println(AList[3])
    println(AList[4])
    println(AList.size)

    //We  can use the in operator to check if an element exists in an array:
    if ("Ram" in name1){
        println("You are right")
    } else{
        println("You are wrong")
    }

}