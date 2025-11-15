package latihan

fun displayAlertMessage(userOperatingSystem: String? = null, userEmailId: String?) {
    return if (userOperatingSystem == "Windows") {
        when(userEmailId){
            "user_one@gmail.com" -> println("There's a new sign-in request on $userOperatingSystem for your Google Account user_one@gmail.com.")
            "user_two@gmail.com"-> println("There's a new sign-in request on $userOperatingSystem for your Google Account user_two@gmail.com.")
            "user_three@gmail.com"-> println("There's a new sign-in request on $userOperatingSystem for your Google Account user_three@gmail.com.")
            else -> println("unknown email")
        }
    } else if (userOperatingSystem == "Mac OS") {
        when(userEmailId){
            "user_one@gmail.com" -> println("There's a new sign-in request on $userOperatingSystem for your Google Account user_one@gmail.com.")
            "user_two@gmail.com"-> println("There's a new sign-in request on $userOperatingSystem for your Google Account user_two@gmail.com.")
            "user_three@gmail.com"-> println("There's a new sign-in request on $userOperatingSystem for your Google Account user_three@gmail.com.")
            else -> println("unknown email")
        }
    } else {
        when(userEmailId){
            "user_one@gmail.com" -> println("There's a new sign-in request on $userOperatingSystem for your Google Account user_one@gmail.com.")
            "user_two@gmail.com"-> println("There's a new sign-in request on $userOperatingSystem for your Google Account user_two@gmail.com.")
            "user_three@gmail.com"-> println("There's a new sign-in request on $userOperatingSystem for your Google Account user_three@gmail.com.")
            else -> println("unknown email")
        }
        println("There's a new sign-in request on Unknown OS for your Google Account $userEmailId")
    }
}

fun main(){
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(userEmailId = firstUserEmailId))

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}
