package spices

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder{

    override fun grind() {
        println("grind")
    }

    override fun prepareSpice() {
        println("prepare curry")
    }


    override fun toString(): String {
        return "SimpleSpice(name='$name', spiciness='$spiciness', heat=$heat, color='$color')"
    }

}

object YellowSpiceColor: SpiceColor {
    override val color: Color
        get() = Color.YELLOW
}