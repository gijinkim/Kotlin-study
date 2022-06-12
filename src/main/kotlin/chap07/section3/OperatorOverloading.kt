package chap07.section3

//연산자의 오버로딩

class Point(var x:Int = 0, var y:Int =0){
    operator fun plus(p:Point) : Point{
        return Point( x + p.x, y + p.y)
    }
}

fun main() {
    val p1 = Point(3, -8)
    val p2 = Point(2, 9)

    var point = Point()
    point = p1 + p2
    println("${point.x},${point.y}")
}