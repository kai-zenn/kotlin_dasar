package basics.tipe_data_dasar

fun main(){
    /*tipe data number dasar*/
    // tipe data number byte, max value 127
    var age: Byte = 127

    // tipe data short, max value 32767
    var height: Short = 185

    // tipe data int/integer, max value 2miliar
    // paling umum digunakan
    var saldo: Int = 80000

    // tipe data long, max value 9kuadriliun++++
    // biasanya untuk sistem di bank
    var bank: Long = 1000000000


    /* floating point number atau desimal */
    //float maksimal hanya 6-7 angka dibelakang koma
    // float harus selalu diakhiri f
    val num1: Float = 5.79999995F // akan menghasilkan 5.7999997, karena melebihi batas
    println(num1)
    //double maksimal sampai 15 angka dibelakang koma, lebih presisi
    val num2: Double = 3.14
    println(num2)


    /*literal number*/
    // nilai angka yang langsung di tulis di kode, bukan berasal dari variabel atau input
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xff
    var binaryLiteral: Int = 0b010100

    /* underscore untuk mempermudah membaca angka*/
    var balance: Int = 10_000_000
}