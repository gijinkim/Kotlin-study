package chap06.section3

class Person{
    var id:Int = 0
    var name: String = "kim"
    companion object{
        var language: String = "korean"
        fun work(){
            println("working..")
        }
    }
}

fun main() {
    println(Person.language)
    Person.language = "eng"
    println(Person.language)
    Person.work()
    println(Person.language)
}