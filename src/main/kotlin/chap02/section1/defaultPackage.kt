package chap02.section1

import edu.Person
import Person as User
import kotlin.math.PI
import kotlin.math.abs

fun main() {

   val user1 = User("Kildong", 30)
    val user2 = Person("A123", "kim")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)
}

class Person(val id:String, val name:String)