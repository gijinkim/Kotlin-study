package chap07.section1

class ElectricHeater (var heating: Boolean = false) : Heater{
    override fun on(){
        println("heating")
        heating = true
    }

    override fun off() {
        heating = false
    }

    override fun isHot(): Boolean = heating
}

