package chap02.secion2

typealias Username = String
val user : Username = "kim"

fun main() {
    val a = 1
    var str1 = "a = $a"
    var str2 = "a = ${a + 2}"
    val special = "\"hello\", I have \$15"
    val special2 = "${'"'}${'$'}9.99${'"'}"

//    println("str1: \"$str1\", str2: \"$str2\"")
    println(special2)
}