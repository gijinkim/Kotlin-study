package chap05.section2

open class Person{

    constructor(fisrtName:String){
        println("[person] firstName: $fisrtName")
    }

    constructor(fisrtName: String, age:Int){
        println("[person] firstName:$fisrtName, $age")
    }
}

class Developer:Person{
    constructor(fisrtName: String): this(fisrtName, 10){
        println("[developer] $fisrtName")
    }
    constructor(fisrtName: String,age: Int):super(fisrtName,age){
        println("[developer] $fisrtName, $age")
    }
}

fun main() {
    val sean = Developer("Sean")
}