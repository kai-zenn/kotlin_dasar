package basics.controlFlow

fun main(){
    println("masukan role anda: ")
    val userRoles = readln();
    // when sebagai statement
    when (userRoles) {
        "viewer" -> println("restricted. kamu tidak memiliki izin untuk mengedit")
        "editor" -> println("silahkan lanjutkan mengedit")
        else -> println("userRoles tidak dikenali")
    }

    // when sebagai expression
    val post = when(userRoles) {
        "viewer" -> println("anda tidak bisa mengedit post ini")
        "editor" -> println("Aoa yang ingin anda edit?")
        else -> println("role tidak dikenali")
    }
}