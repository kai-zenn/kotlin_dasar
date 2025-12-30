package basics.condition

fun main() {
    /* throw exception
     untuk mengindikasikan ketika suatu problem terjadi
     lalu melempar error yang sudah kita tetapkan
    */
    val cause = IllegalStateException("Original cause: illegal state")
    fun validateInput(input: Int) {
        if (input < 0) {
            throw IllegalArgumentException("Input must be non-negative", cause)
        }
    }
    println(validateInput(-10))

    // precondition function untuk otomatis throw exception
    // require()
    fun getIndices(count: Int): List<Int> {
        require(count >= 0) { "Count must be non-negative. You set count to $count." }
        return List(count) { it + 1 }
    }
    // This fails with an IllegalArgumentException
    println(getIndices(-1)) // akan otomatis throw IllegalArgumentException
    println(getIndices(3)) // [1, 2, 3]


    // check
    var someState: String? = null

    fun getStateValue(): String {

        val state = checkNotNull(someState) { "State must be set beforehand!" }
        check(state.isNotEmpty()) { "State must be non-empty!" }
        return state
    }
    // If you uncomment the line below then the program fails with IllegalStateException
    // getStateValue()

    someState = ""

    // If you uncomment the line below then the program fails with IllegalStateException
    // getStateValue()
    someState = "non-empty-state"

    // This prints "non-empty-state"
    println(getStateValue())

    // error
    // paling sering digunakan
    class User(val name: String, val role: String)
    fun processUserRole(user: User) {
        when (user.role) {
            "admin" -> println("${user.name} is an admin.")
            "editor" -> println("${user.name} is an editor.")
            "viewer" -> println("${user.name} is a viewer.")
            else -> error("Undefined role: ${user.role}")
        }
    }

    // This works as expected
    val user1 = User("Alice", "admin")
    processUserRole(user1)
    // Alice is an admin.

    // This throws an IllegalStateException
    val user2 = User("Bob", "guest")
    processUserRole(user2)
}