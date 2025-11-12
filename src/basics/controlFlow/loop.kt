package basics.controlFlow

fun main(){
    var mobil = arrayOf("beemwe", "polpo", "lada", "toyota", "mazda")
    for (x in mobil) {
        println(x)
    }


    var routineSteps =  arrayOf("bangun", "merapihkan kasur", "mandi", "memakai seragam")
    for (i in routineSteps.indices) {
        println(routineSteps[i])
    }


    println("barang yang harus dibeli:")
    val shoppingList = listOf("SKM", "saput", "tisu magik")
    for (items in shoppingList) {
        println("- $items")
    }
}