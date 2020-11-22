package classobject

class private{
    var first : Int = 0
    var second : Int = 0
    fun setfirst(_first:Int){
        first = _first
    }
    fun getfirst():Int{
        return first
    }
    fun setsecond(_second:Int){
        second=_second
    }
    fun getsecond():Int{
        return second
    }
    fun add(): Int{
        return first  + second
    }

    fun subract(): Int {
        return first - second
    }
}

fun main(){
    val Arithmetic = private()

    Arithmetic.setfirst(5)
    Arithmetic.setsecond(8)

    println("Sum of ${Arithmetic.getfirst()} and ${Arithmetic.getsecond()} is ${Arithmetic.add()}")
    println("Subract of ${Arithmetic.getfirst()} and ${Arithmetic.getsecond()} is ${Arithmetic.subract()}")

}
