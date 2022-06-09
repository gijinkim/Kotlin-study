package chap03.section3

fun main() {
//    noParam ({"Hello world"})
//    noParam {"Hello world!"}
//    oneParam { "Hello world $it" }
//    moreParam{_, b ->"Hello World  $b"}
    withArgs("Args1", "Args2") {a,b -> "Hello World! $a $b"}
}


//fun noParam(out:() -> String) = println(out())
//fun oneParam(out:(String) -> String){
//    println(out("OneParam"))
//}
//
//fun moreParam(out:(String, String) -> String){
//    println(out("OneParam", "TwoParam"))
//}

fun withArgs(a:String, b:String, out:(String,String) -> String){
    println(out(a,b))
}