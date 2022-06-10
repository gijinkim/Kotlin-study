package chap03.section3

fun main() {
    twoLambda({a, b -> "First $a $b"}, {"Second $it"})
}

fun twoLambda(first:(String, String) -> String, second: (String) -> String){
    println(first("one", "two"))
    println(second("one"))
}

//val add: (Int, Int) -> Int = fun(x:Int, y: Int):Int = x + y

val add = fun(x:Int, y:Int) = x + y
val result = add(10 ,2)
