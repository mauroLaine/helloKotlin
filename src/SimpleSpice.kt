class SimpleSpice (var name: String, var spiciness: String = "mild") {

    var heat: Int = 0
    init {
        heat = when(spiciness) {
            "nuclear" -> 5
            "hot" -> 4
            "medium" -> 3
            "mild" -> 2
            else -> 0
        }
    }

    init {
        println(toString())
    }
    override fun toString(): String {
        return "SimpleSpice(name='$name', spiciness='$spiciness', heat=$heat)"
    }

}