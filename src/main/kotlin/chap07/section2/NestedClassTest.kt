package chap07.section2

//중첩클래스 사용하기

class Outer{
    val ov = 5
    class Nested{
        val nv = 10
        fun greeting() = "Nested Hello ! $nv"
    }

    fun outside(){
        val msg = Nested().greeting()
        println("$msg, ${Nested().nv}")
    }
}

fun main() {
    val output = Outer.Nested().greeting()
    println(output)

    val outer = Outer()
    outer.outside()
}