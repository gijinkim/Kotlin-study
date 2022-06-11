package chap06.section2

interface Car{
    fun go() : String
}

class VanImpl(val power:String): Car{
    override fun go(): String = "은 짐을 적재하며 $power 을 가집니다"
}

class SportImpl(val power: String): Car{
    override fun go(): String = "은 경주용으로 사용되며 $power 를 가집니다"
}

class CarModel(val model:String, imp:Car) : Car by imp{
    fun carinfo(){
        println("$model ${go()}")
    }
}

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100마력"))
    val my350z = CarModel("350z 2008", SportImpl("350마력"))

    myDamas.carinfo()
    my350z.carinfo()
}