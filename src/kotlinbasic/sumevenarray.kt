package kotlinbasic

fun main() {
    var arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    displaysumEven(arr)
}

fun displaysumEven(arr: Array<Int>) {
    println("Even number are: ")
    var sum = 0
    for (a in arr.indices) {
        if (arr[a] % 2 == 0) {
            sum += arr[a]
        }
    }
    println("$sum")
}

