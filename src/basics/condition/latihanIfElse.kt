package basics.condition

fun main(){
    println("masukan golongan gaji anda:");
    var golongan = readLine()?.uppercase();
    println("masukan berapa lama anda lembur: ")
    var jamLembur = readLine()?.toIntOrNull()
    val gajiPokok = when (golongan) {
        "A" -> 5000000
        "B" -> 6500000
        "C" -> 9500000
        else -> {
            println("Golongan tidak valid.")
            return
        }
    }

    val persentaseBonus = when {
        jamLembur == 1 -> 0.30
        jamLembur == 2 -> 0.32
        jamLembur == 3 -> 0.34
        jamLembur == 4 -> 0.36
        else -> 0.38
    }

    val gajiLembur = gajiPokok * persentaseBonus
    val totalGaji = gajiPokok + gajiLembur

    println(golongan)
    println(gajiLembur.toInt())
    println(totalGaji)


    // cara manual jir
//    if (jamLembur >= 1){
//        println(gajiA * 30/100 + gajiA)
//    } else if(jamLembur >= 2){
//        println(gajiA * 32/100 + gajiA)
//    } else if(jamLembur >= 3){
//        println(gajiA * 34/100 + gajiA)
//    } else if (jamLembur >= 4) {
//        println(gajiA * 36/100 + gajiA)
//    } else {
//        println(gajiA * 38/100 + gajiA)
//    }
}