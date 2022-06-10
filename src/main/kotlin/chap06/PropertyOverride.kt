package chap06

open class First{
    open val x:Int = 0
        get(){
            println("First x")
            return field
        }

    val y: Int = 0;
}

class Second : First(){
    override val x: Int =0
        get() {
            println("Second x")
            return field + 3
        }
}

fun main() {
    val second = Second()
    val first = First()
    println(first.x)
    println(second.y)
}