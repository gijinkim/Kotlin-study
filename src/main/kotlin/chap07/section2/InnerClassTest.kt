package chap07.section2

//이너클래스의 바깥 클래스의 맴버 접근
//매서드에 지역 클래스 적용하기
//익명객체를 위한 인터페이스 추가하기

interface Switcher{
    fun on():String
}

class Smartphone(val model:String){
    private val cpu = "Exynos"

    inner class ExternalStorage(val Size:Int){
        fun getInfo() = "$model , $cpu , $Size"
    }

    fun powerOn():String {
        class Led(var color:String){
            fun blink():String = "$color on $model"
        }
        val powerStatus = Led("Red")
        val powerSwich = object : Switcher{
            override fun on(): String {
                return powerStatus.blink()
            }
        }
        return powerSwich.on()
    }
}

fun main() {
    val mySdcard = Smartphone("s7").ExternalStorage(32)
    println(mySdcard.getInfo())
    val myphone = Smartphone("Note9")
    myphone.ExternalStorage(128)
    println(myphone.powerOn())
}

