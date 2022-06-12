package chap07.section2

//data class 만들어보기

data class Customer(var name:String, var email:String){
    var job:String = "Unknow"

    constructor(name: String,email: String,_job: String):this(name,email){
        job = _job
    }
    init {

    }
}

fun main() {
    val cus1 = Customer("kim", "aaa@aaa.com")
    val cus2 = Customer("kim", "aaa@aaa.com")
    val cus3 = cus1.copy(name = "gijin")
    val (name,email) = cus1
    println("name = $name , email = $email")
}

