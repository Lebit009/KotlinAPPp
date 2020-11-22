package classobject

class arithmetic{
    var first : Int = 0
    var second : Int = 0

    fun add(): Int{
        return first  + second
    }

    fun subract(): Int {
        return first - second
    }
}

fun main(){
    val Arithmetic =arithmetic()

    Arithmetic.first = 5
    Arithmetic.second =8

    println("Sum of ${Arithmetic.first} and ${Arithmetic.second} is ${Arithmetic.add()}")
    println("Subract of ${Arithmetic.first} and ${Arithmetic.second} is ${Arithmetic.subract()}")

}
