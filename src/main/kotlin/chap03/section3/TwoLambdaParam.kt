package chap03.section3

fun main() {
    twoLambda({a, b -> "First $a $b"}, {"Second $it"})
}

fun twoLambda(first:(String, String) -> String, second: (String) -> String){
    println(first("one", "two"))
    println(second("one"))
}