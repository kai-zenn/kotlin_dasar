class Tuktuk {
    var merk = ""
    var model = ""
    var tahun = 0
}


fun main(){
    var mobil = Tuktuk()

    mobil.merk = "toyota"
    mobil.model = "innova"
    mobil.tahun = 2017

    println(mobil.merk)
    println(mobil.model)
    println(mobil.tahun)
}