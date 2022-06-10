package chap04.section1

class MyClass

fun main() {
    case("Hello")
    case(1)
    case(System.currentTimeMillis())
    case(MyClass())
}

fun case(obj:Any){
    when(obj){
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Int: $obj")
    }
}