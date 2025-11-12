package basics.controlFlow

fun main(){
    var i = 0;
    var condition = false;

    // selama kondisi terpenuhi, akan melakukan iterasi
    while (i <= 10) {
        // berisi aksi / iterasi
        println(i)
        ++i
    }

    while (condition) {
        println("hasil while condition")
    } // tidak akan menghasilkan iterasi karena kondisinya tidak terpenuhi

    // mengekesekusi kode didalamnya minimal sekali
    do {
        // tidak termasuk kedalam loop meskipun sejak awal kondisinya tidak terpenuhi
        println("hasil print iterasi")
    } while (condition)
}