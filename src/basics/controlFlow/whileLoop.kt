package basics.controlFlow

fun main(){
    var i = 0;
    var condition = false;

    /* selama kondisi belum terpenuhi, akan melakukan iterasi */
//    while (i <= 10) {
//        // berisi aksi / iterasi
//        println(i)
//        ++i
//    }

    while (condition) {
        println("hasil while condition")
    } // tidak akan menghasilkan iterasi karena kondisinya tidak terpenuhi


    /* mengekesekusi kode didalamnya minimal sekali */
    do {
        // tidak termasuk kedalam loop meskipun sejak awal kondisinya tidak terpenuhi
        println("hasil print iterasi")
    } while (condition)

   // break, untuk keluar dari loop
    while (i < 10) {
        println("hasil dari loop dengan break: $i")
        ++i
        if (i == 8)
            break
    }

    // continue, break satu iterasi lalu melanjutkan dengan iterasi berikutnya jika kondisi sudah terpenuhi
    while (i <= 10) {
        if (i <= 4) {
            i++
            continue
        }
        println("hasil dari loop dengan continue: $i")
        i++
    } // outputnya akan dimulai dari 5, karena meng skip 4

    println("masukan angka yang ingin anda hitung: ")
    var angkaKamu = readln().toIntOrNull()?:0
    var sum = 0
    while (i < angkaKamu) {
        println("masukan angka ke #${i + 1}")
        var angka = readln().toIntOrNull()?:0
        sum += angka
        i++
    }
    println("totalnya adalah $sum")
}