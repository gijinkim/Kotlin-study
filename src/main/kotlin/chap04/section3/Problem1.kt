package chap04.section3

fun main() {
    var str1:String ?= "Hello"
    val len = if (str1 != null)str1.length else -1
    println(len)
}