package basics.collection

fun main() {
    /* ranges biasanya untuk perulangan */

    // inclusive range ( pake .. atau rangeTo )
    // termasuk awal dan akhir nilai tujuan
    val ranges = 1..10;
    // iterasi dengan for loop
    for (number in ranges) {
        println("${number}")
    }

    // exlusive range ( pake until atau ..< )
    // termasuk awal tapi nilai akhir tidak, berguna untuk menghindari IndexOutOfBoundsException
    val array = arrayOf("a", "b", "c")
    for (i in 0 until array.size) {
        println(array[i]) // Prints array[0], array[1], array[2]
    }

    /* range juga bisa untuk mengecek kondisi */
    val value = 7
    if (value in 1..10) {
        println("$value is within the range 1 to 10")
    }

    val character = 'c'
    when (character) {
        in 'a'..'e' -> println("Character is in the first five letters of the alphabet")
        in 'f'..'z' -> println("Character is a later letter")
    }
}