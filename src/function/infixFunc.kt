package function

/* memungkinkan fungsi dipanggil dengan sintaksis yang lebih alami */

// infix function harus bagian dari extension function
infix fun Int.add(number: Int): Int {
    return this + number
}

infix fun Int.multiply(number: Int): Int {
    return this * number
}

// atau bisa juga member function dari suatu class
class Orang(){
    infix fun sapa(name: String): String {
        return "hello $name"
    }
}

fun main(){
    val num = 10
    val newNum = num.add(10)
    val nomor = 90
    val nomorBaru = nomor.multiply(2)
    3 multiply 6

    val makhluk = Orang()

    println(makhluk.sapa("prabowo"))
    println(nomorBaru)
    println(newNum)
}