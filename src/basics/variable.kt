package basics

fun main(){
    // dynamically typing in kotlin
    val name = "jokowi" // immutable atau tidak berubah
    var age = 666 // mutable atau bisa berubah nilainya

    // statically typing
    // typesafe in kotlin
    var namaPertama: String = "kotlin" // sah aja, tapi redundant
    var namaKedua: String = "keren" // kotlin sudah memiliki fitur dynamic typing
    var umurGwe: Int = 17

    // mendeklarasikan value setelah memberikan tipe kepada variabel
    var namaGwe: String
    namaGwe = "gibrant"

    println("halo nama saya $name, saya berumur $age")
}