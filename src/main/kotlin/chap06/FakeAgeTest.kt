package chap06

fun main() {
   val kim = FakeAge()
    kim.age = 15
    println("${kim.age}")

}

class FakeAge{
    var age:Int =0
    set(value) {
        field = value +5
    }
}

