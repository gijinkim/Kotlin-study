package chap04.section3

fun main() {
    make(1)
}

fun make(a:Int){
    when(a){
        !in 10..20 -> {
            println("$a 는 10~20이 아닙니다")
        }
    }
}