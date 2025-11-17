package OOP

class Mobil(var merk: String, var model: String, var tahun: Int) {
    fun jalan(){
        println("vroomvroom!")
    }
    // pass parameters to a class function:
    fun kecepatan(maxSpeed: Int){
        println("kecepatan maksimumnya adalah" + maxSpeed)
    }
}

// Class with a primary constructor declaring properties
class PersonWithFunc(val name: String, var age: Int) {
    // Member function accessing class properties
    fun introduce(): String {
        return "Hi, I'm $name and I'm $age years old."
    }
}

fun main(){
    val kendaraan = Mobil("mazda", "stargazer", 2022)
    println(kendaraan.jalan())
    println(kendaraan.kecepatan(200))

    val orang = PersonWithFunc("ardin", 17)
    println(orang.introduce())
}