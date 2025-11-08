package basics.tipe_data_dasar

fun main(){
    var number: Int = 10_000

    // kita konversikan angkanya menjadi tipe yang lain
    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()


}