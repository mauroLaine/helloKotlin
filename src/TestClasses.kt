
fun main(args: Array<String>){


    var spices = listOf<SimpleSpice>(
            SimpleSpice("curry", "none"),
            SimpleSpice("pepper"),
            SimpleSpice("ginger", "hot"),
            SimpleSpice("green curry", "medium"),
            SimpleSpice("habanero", "nuclear"),
            makeSalt()
    )
    println("******")
    println(spices.filter { it.heat >= 3 })

}

fun makeSalt() = SimpleSpice("salt")
