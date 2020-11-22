package list

fun main(){
//    //immutable
//    var list = listOf("one","two","three")
//    for (i in list.indices){
//        println(list[i])
//    }
    //mutable
    val mutablelist = mutableListOf("one","two","three")
    mutablelist.add("Four")
    mutablelist.add("Five")
    for (i in mutablelist.indices){
        println(mutablelist[i])
    }
}