package kotlinbasic

fun main() {
    var arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    displayEven(arr)
}

fun displayEven(arr: Array<Int>) {
    println("Even number are: ")
    for (a in arr.indices) {
//        0 until arr.size
        if (arr[a] % 2 == 0) {
            println(arr[a])
        }
    }
}
