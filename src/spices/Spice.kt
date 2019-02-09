package spices

abstract class Spice (var name: String, var spiciness: String = "mild", color: SpiceColor): SpiceColor by color {

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
//        println(toString())
    }
    override fun toString(): String {
        return "Spice(name='$name', spiciness='$spiciness', heat=$heat)"
    }
    abstract fun prepareSpice()
}