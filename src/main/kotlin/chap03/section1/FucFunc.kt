package chap03.section1

fun main() {
    println("fucnFunc: ${funcFunc()}")
}

fun sum(a:Int, b:Int) = a + b

fun funcFunc():Int{
    return sum(2,2)
}