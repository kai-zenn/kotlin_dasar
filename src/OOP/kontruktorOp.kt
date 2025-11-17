package OOP


// Primary constructor parameter that is also a property
class Car(var Merk: String, var Model: String, var Tahun: Int)

// Primary constructor parameter only (not stored as a property)
class OrangDenganTugas(name: String){
    // Must be assigned to a property to be usable later
    val displayNem: String = name
}

// kelas dengan default value
class Person(val name: String = "John", var age: Int = 30) {

}


fun main(){
    val tugas = OrangDenganTugas("jokowi")
    val mobil = Car("Yotoya", "kijang", 2012)
    println(mobil.Merk)
    println(tugas.displayNem)
}