package function

fun celciusKeFahreheit(x: Int = 0): Int {
    val rumus: Int = (x * 9/5)
    return rumus // mengembalikan nilai dari fungsi
}

fun main(){
    val hasilKonversi = celciusKeFahreheit(55)
    println(hasilKonversi)
}