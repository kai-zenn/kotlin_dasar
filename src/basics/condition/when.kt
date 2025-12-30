package basics.condition

/* berguna untuk mengecek sebuah kondisi yang banyak berdasarkan input parameter */
fun main() {
    val trafficLightColor = "Black"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
}