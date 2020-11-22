package classobject

class ArithmeticConstructor(
    val first: Int,
    val second: Int
) {
    fun add(): Int{
        return first + second
    }
}
fun main(){
    val arithmeticConstructor = ArithmeticConstructor(4,6)
    println("Sum of ${arithmeticConstructor.first} and ${arithmeticConstructor.second} is ${arithmeticConstructor.add()}")
}