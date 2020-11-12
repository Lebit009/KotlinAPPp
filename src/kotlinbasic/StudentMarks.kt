package kotlinbasic

fun main(){
    println("Enter marks for android")
    var android = readLine()!!.toInt()
    println("Enter marks for WebAPI")
    var webAPI = readLine()!!.toInt()
    println("Enter marks for IOT")
    var iot = readLine()!!.toInt()
    var total = android+webAPI+iot
    var precentage = total/3
    getDivision(precentage)
}

fun getDivision(percentage: Int) {
    when(percentage){
        in 0..39 -> print("Fail")
        in 40..49 -> print("Third Division")
        in 50..59 -> print("Second Division")
        in 60..69 -> print("First Division")
        in 70..100 -> print("Distinction")
        else -> print("Invalid Input")
    }
}
