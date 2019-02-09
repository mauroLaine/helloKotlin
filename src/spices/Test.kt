package spices


fun main(args: Array<String>){

    var curry = Curry("yellow curry", "mild")
    println(curry.color)

    var container = SpiceContainer("lunch", curry)
    println(container)
}
