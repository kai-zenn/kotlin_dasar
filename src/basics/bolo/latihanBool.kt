package basics.bolo

fun main(){
    // input umur
    var umurGwe = 17;
    if (umurGwe < 13) {
        println("anak-anak")
    } else if (umurGwe in 13..17) {
        println("remaja")
    } else if (umurGwe in 18..59) {
        println("dewasa")
    } else {
        println("lansia")
    }
}