package chap03.section1

fun main() {
    var result:Int
    val multi :(Int, Int, Int) -> Int = {x, y, z -> x + y + z}
    result = multi(10, 20, 30)
    val multi2:(Int, Int) -> Int = {x:Int, y:Int ->
        println("x * y")
        x*y }
    println(result)

    val greet = { println("Hello world") }
    val square = {x:Int -> x * x}
    val nestedLamda = {{ println("nested") }}
}