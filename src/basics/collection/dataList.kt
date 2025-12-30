package basics.collection

/* Ordered collection of elements */
fun main(){
    //immutable list
    val etalase: List<String> = listOf("indomie", "mie gaga", "mie sedap");
    //mutable list
    val mutableList = mutableListOf("shaka", "sakha", "sahka", "saput");
    mutableList.add("burung gede") // menambahkan element
    mutableList.removeAt(0) // menghapus element berdasarkan index nya

    println(etalase)
    println(mutableList)
}