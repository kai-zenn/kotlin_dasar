package latihan

fun displayAlertMessage(userOperatingSystem: String? = "UnknownOS", userEmailId: String?): String {
    return "There is a new sign-in request on $userOperatingSystem for your Google Account $userEmailId."
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
