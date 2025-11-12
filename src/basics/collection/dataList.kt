package basics.collection

fun main(){
    //immutable list
    val etalase: List<String> = listOf("indomie", "mie gaga", "mie sedap");
    //mutable list
    val mutableList = mutableListOf("shaka", "sakha", "sahka", "saput");
    mutableList.add("burung gede") // Add an element
    mutableList.removeAt(0) // Remove an element by index

    println(etalase)
    println(mutableList)
}