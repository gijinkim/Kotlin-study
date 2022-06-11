package chap07.section1

abstract class Vehicle(val name:String, val color :String, val weight:Double){
    abstract var maxSpeed:Double

    var year ="2018"

    abstract fun start()
    abstract fun stop()

    fun displaySpecs(){
        println("Name: $name, Color: $color, Weight: $weight, Year: $year, Max Speed: $maxSpeed")
    }
}

class Car(name:String,
          color: String,
          weight: Double,
          override var maxSpeed:Double)
    :Vehicle(name, color, weight){

    override fun start() {
        println("Car Started")
    }

    override fun stop() {
        println("Car Stopped")
    }
    }