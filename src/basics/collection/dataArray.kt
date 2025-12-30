package basics.collection

/* 	Collection of elements */
fun main(){
    // type static array
    val kelas:Array<Int> = arrayOf(10, 11, 12, 13);
    val jurusan:Array<String> = arrayOf("PPLG", "SIJA", "DKV", "RPL");
    // dynamic array
    val sekolah = arrayOf("smk40", "smk46", "smk26", "smk48")

    // mengubah nilai dalam array, karena array bersifat mutable
    sekolah[0] = "smk1"

    println("saya kelas ${kelas[1]}")
    println("saya dari jurusan ${jurusan[0]}")
    println("saya sekolah di ${sekolah[0]}")

    // in operator untuk mengecek apakah ada
    if ("PPLG" in jurusan) {
        println("Ada mapelnya cuyy")
    } else {
        println("yah belom ada cuyy")
    }
    // array lenght / size
    println(sekolah.size)

}