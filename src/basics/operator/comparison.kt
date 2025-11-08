package basics.operator

fun main(){
    // perbandingan yang digunakan untuk pengkondisian boolean
    val a = 5
    val b = 5
    val isEqual = (a == b) // true

    val x = 10
    val y = 7
    val notEqual = (x != y) // true

    val num1 = 100
    val num2 = 95
    val greaterThan = num2 > num1 // false
    val rightGreaterThan = num1 > num2 // true

    println(isEqual)
    println(notEqual)
    println(greaterThan)
    println(rightGreaterThan)
}