package classobject

class person(
    val fname: String,
    val lname: String,
    val age: Int
)
fun main() {
    val personList = mutableListOf<person>()
    for (i in 1..3){
        println("Enter person $i details")
        println("Enter fname: ")
        val fname = readLine()!!
        println("Enter fname: ")
        val lname = readLine()!!
        println("Enter fname: ")
        val age = readLine()!!.toInt()
        personList.add(person(fname,lname,age))
    }
//    for (i in personList.indices){
//        println("First name:${personList[i].fname}")
//        println("age:${personList[i].age}")
//    }
    for (person in personList){
        println("First name:${personList[i].fname}")
        println("age:${personList[i].age}")
    }
}

