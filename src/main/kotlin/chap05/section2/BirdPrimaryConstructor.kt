package chap05.section2

class Bird(var name:String, var wing: Int, var beak: String, var color:String){
    fun fly() = println("$wing")
    fun sing(vol:Int) = println("$vol")

    init {
        println("초기화 블록")
    }
}

