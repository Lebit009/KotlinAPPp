package kotlinbasic

fun main() {
    var arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    displayOdd(arr)
}

fun displayOdd(arr: Array<Int>) {
    println("Odd numbers are: ")
    for (a in arr.indices) {
        if (arr[a] % 2 !== 0){
            println(arr[a])
        }
    }
}

