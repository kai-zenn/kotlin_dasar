package function

// menginialisasi fungsi
// fungsi dengan multiple parameter
fun luasPersegiPanjang(x: Int, y: Int): Int {
    val luas: Int = (x * y)
    return luas // mengembalikan nilai dari fungsi
}

fun myFunc(name: String): String {
    return "nama saya adalah " + name
}

fun fungsiSapaan(){
    println("Halo Sudjitmoko")
}

fun birthdayGreeting(): String {
    val nameGreeting = ("Happy Birthday, Rover!")
    val ageGreeting = ("You are now 5 years old!")
    return "$nameGreeting \n $ageGreeting"
}

fun main(){
    fungsiSapaan()
    val hitung = luasPersegiPanjang(10, 8)
    val greeting = birthdayGreeting()
    println(hitung)
    print(greeting)
}