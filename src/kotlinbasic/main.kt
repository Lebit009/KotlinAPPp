package kotlinbasic

fun main(){
    println("Enter radius: ")
    var radius = readLine()!!.toInt()

    var area = areaofCircle(_radius = radius)
    println("Area of circle is $area")
}

fun areaofCircle(pi:Float = 3.14F, _radius: Int): Float {
    return pi*_radius*_radius
}
