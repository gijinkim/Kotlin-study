package chap07.section1

//여러 인터페이스 구현해보기

interface Bird{
    val wing : Int
    fun fly()
    fun jump(){
        println("bird jump!")
    }
}

interface Horse{
    val maxSpeed: Int
    fun run()
    fun jump(){
        println("jump!, max speed: $maxSpeed")
    }
}

class Pegasus:Bird, Horse{
    override val wing: Int = 2
    override val maxSpeed: Int = 100
    override fun fly() {
        println("Fly!")
    }

    override fun jump() {
        super<Horse>.jump()
        println("Pegasus Jump!")
    }

    override fun run() {
        println("Run!")

    }
}

fun main() {
    val pegasus = Pegasus()
    pegasus.fly()
    pegasus.run()
    pegasus.jump()
}