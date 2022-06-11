package chap06.section3

object OCustomer{
    var name = "kim"
    fun greeting() = println("Hello Wordl")
    val HOBBY = Hobby("Basketball")
    init {
        println("Init")
    }
}

class CCustomer{
    companion object{
        const val HELLO = "hello"
        var name = "joo"

    }
}

class Hobby(val name:String)