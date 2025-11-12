package basics.condition

fun main(){
    val x = 100;
    val y = 75;

    if (x >= y) {
        println("x ternyata lebih gede jir")
    } else {
        println("y yang lebih gede ternyata")
    }

    val jam = 22
    if (jam < 10) {
        println("pagi gusy")
    } else if (jam < 20) {
        println("gud dey")
    } else {
        println("malam gusy")
    }
}