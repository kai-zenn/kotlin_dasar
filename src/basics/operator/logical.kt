package basics.operator

fun main() {
    val a = true
    val b = false
    // operator AND
    // Returns true only if both operands are true
    println("a && b: ${a && b}") // Output: a && b: false

    // operator OR
    // Returns true if at least one of the operands is true
    println("a || b: ${a || b}") // Output: a || b: true

    // operator NOT
    // everses the boolean value of its operand. If the operand is true, it returns false, and vice-versa.
    println("!a: ${!a}")         // Output: !a: false

    val x = 10
    val y = 5

    if ((x > y) && (y < 20)) {
        println("Both conditions are true.")
    }

    if ((x < y) || (y == 5)) {
        println("At least one condition is true.")
    }
}