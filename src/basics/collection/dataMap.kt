package basics.collection

fun main() {
    /* Immutable maps*/
    val nilaiMurid: Map<String, Int> = mapOf("joko" to 90, "pascabowo" to 11, "sahroni" to 69);
    // keyword "to" adalah sebuah infix function yang membuat "Pair" objek
    // "mapOf" akan membuat/construct map nya
    println(nilaiMurid); // output nya {joko=90, pascabowo=11, sahroni=69};

    /* Mutable maps */
    val gudang: MutableMap<String, Int> = mutableMapOf(
        "laptop" to 10,
        "ram" to 90,
        "ssd" to 20
    );
    println("data gudang sebelum update ada: ${gudang}");

    // akan menambahkan item ke dalam maps
    gudang["keybord"] = 30;
    println("Setelah menambah katalog keyboard: ${gudang}");

    // akan mengUpdate item dalam maps, dengan cara memanggil nama item yang sama
    gudang["laptop"] = 30;
    println("stock laptop setelah restock: ${gudang}");

    // akan menghapus item
    gudang.remove("ram");
    println("setelah ram habis diborong: ${gudang}");
}