fun main(args: Array<String>){

    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9)
    println(numbers.reversed())
    println(numbers.sumBy { it.minus(1) })
    val allBooks: Set<String> = setOf("Macbeth", "Romeo and Juliet", "Hamlet")
    val library = mapOf<String, Set<String>>("William Shakespare" to allBooks)
    println(library.any { it.value.contains("Hamlet") })
    val moreBooks = mutableMapOf<String, String>(
            "Macbeth" to "William",
            "Dorian Gray" to "Oscar",
            "Meditations" to "Marcus")
    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrDefault("Bad Blood", "John")

    println(moreBooks.getOrElse("1942") {"no results"})
    println(moreBooks["Macbeth"])
    println(moreBooks)

}