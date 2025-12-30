package basics.collection

/* Collection of unique elements */
fun main() {
    // Immutable set
    val immutableSet = setOf("Apple", "Banana", "Cherry")
    println(immutableSet) // Output: [Apple, Banana, Cherry]

    // Attempting to add a duplicate (ignored)
    val setWithDuplicate = setOf("Apple", "Banana", "Cherry", "Apple")
    println(setWithDuplicate) // Output: [Apple, Banana, Cherry]

    // Mutable set
    val mutableSet = mutableSetOf("Dog", "Cat")
    println(mutableSet) // Output: [Dog, Cat]

    // Adding and removing elements in a mutable set
    mutableSet.add("Bird")
    mutableSet.remove("Dog")
    println(mutableSet) // Output might be [Cat, Bird] or [Bird, Cat] as order isn't guaranteed
}
