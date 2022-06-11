package chap06.section2

class LazyTest{

    init {
        println("init block")
    }

    val subject by lazy{
        println("lazy initialized")
        "Kotlin Programming"
    }

    fun flow(){
        println("not initialzed")
        println("subject one:${subject}")
        println("subject two:${subject}")
    }

}

fun main() {
    val test = LazyTest()
    test.flow()
}