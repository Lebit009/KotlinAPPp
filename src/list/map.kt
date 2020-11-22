package list

fun main() {
//    val students(keys) = arrayOf("Kiran", "salman", "Katrina")
//    val marks(values) = array(1, 2, 3)
//
    //immutable
    val studentMarks = mapOf<String, Int>(
        "kiran" to 1,
        "salman" to 2,
        "Katrina" to 3
    )
//    println("All keys are: ${studentMarks.keys}")
//    println("All values are: ${studentMarks.values}")
    println("Enter the name: ")
    val stdname= readLine()!!
    println("$stdname marks is: ${studentMarks[stdname]}")


    //mutable
    val studentMarks1 = mutableMapOf<String, Int>(
        "kiran" to 1,
        "salman" to 2,
        "Katrina" to 3
    )
    studentMarks1.put("Ranbir",8)
    studentMarks1["heroAlom"] =4
    println("All keys are:  ${studentMarks1.keys}")
}