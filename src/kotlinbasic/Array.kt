package kotlinbasic

fun main(){
    var arr = IntArray(5)

    for(a in 0..arr.size-1){
//        0 until arr.size
        println("Enter $(a+1) element: ")
        arr[a] = readLine()!!.toInt()
    }
    println("Elements in array")
    for(a in arr.indices){
        println(arr[a])
    }
}