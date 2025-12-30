package function


/*
named argument adalah fitur yang berguna saat memanggil sebuah function
 fitur memungkinkan kita untuk memanggil nama parameter nya lalu kita assign sebuah value
 jika tidak tau urutan parameternya
*/

fun namaLengkap(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Halo, nama saya ${firstName} ${middleName} $lastName")
}

fun main(){
    namaLengkap(firstName = "Joko", lastName = "Widodo", middleName = "Pascabowo")
}