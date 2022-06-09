package chap03.section1

import kotlin.math.max



fun main() {
    val num1 = 10
    val num2 = 3
    val result:Int

    result = max(num1, num2)
    add("kim")

    println(result)
}

fun printSum(a:Int, b:Int) {
    println("sum of $a and $b is ${a + b}")
}

//fun add(name:String, email: String = "default"){
//
//}



