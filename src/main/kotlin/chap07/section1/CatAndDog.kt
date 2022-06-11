package chap07.section1

//인터페이스를 구현의 필요성

open class Animal(val name:String)

class Dog(name:String, override var category: String) : Animal(name), Pet{

    override var species: String = "dog"

    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master{

    fun playWithPet(pet:Pet){
        println("Enjoy with my ${pet.species}.")
    }

//    fun playWithPet(dog: Dog){
//        println("Enjoy with my dog.")
//    }
//    fun playWithPet(cat: Cat){
//        println("Enjoy with my cat.")
//    }

}

fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}