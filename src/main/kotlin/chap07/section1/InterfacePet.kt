package chap07.section1

import javax.lang.model.element.NestingKind

//인터페이스 만들고 구현하기

interface Pet{
    var category: String
    fun feeding()
    fun patting(){
        println("Keep patting!")
    }

    val msgTags:String
        get() = "I'm your lovely pet!"

    var species:String
}

class Cat(name:String,override var category: String):Pet , Animal(name){

    override var species: String = "cat"
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat("kim","small")
    println("Pet Category: ${obj.category}")
    obj.feeding()
    obj.patting()
}