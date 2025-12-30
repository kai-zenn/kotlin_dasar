package function

/* ruang lingkup dimana function bisa diakses */

// local function, function yang dideklarasikan didalam function lain
class Person(val name: String) {
    val friends = mutableListOf<Person>()
}
class SocialGraph(val people: List<Person>)
fun dfs(graph: SocialGraph) {
    fun dfs(current: Person, visited: MutableSet<Person>) {
        if (!visited.add(current)) return
        println("Visited ${current.name}")
        for (friend in current.friends)
            dfs(friend, visited)
    }
    dfs(graph.people[0], HashSet())
}

// member function, function yang berada didalam class atau object
class Makhluk(){
    fun sapa(name: String): String {
        return "hello $name"
    }
}

fun main() {
    val alice = Person("Alice")
    val bob = Person("Bob")
    val charlie = Person("Charlie")
    alice.friends += bob
    bob.friends += charlie
    charlie.friends += alice
    val network = SocialGraph(listOf(alice, bob, charlie))
    dfs(network)
    val orang = Makhluk()
    println(orang.sapa("joko"))
}