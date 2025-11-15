package latihan

fun main(){
    var angka = readln().toIntOrNull()?:0

    if (angka < 0) {
        println("angka negatif")
    } else if (angka > 0) {
        println("angka positif")
    } else {
        println("angkanya nol")
    }
}