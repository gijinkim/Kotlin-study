package chap03.section5

fun a() = b()
fun b() = println("b")

fun c(){
    fun e() = println("e")
}

fun main() {
    a()
}