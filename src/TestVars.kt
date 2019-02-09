


fun main(args : Array<String>) {

    fish()
    colors()
    nullability()

    age(17)
    age(18)
    age(35)
}

fun fish(){
//If you start with 2 fish, and they breed twice, producing 71 offspring the first time,
// and 233 offspring the second time, and then 13 fish are swallowed by a hungry moray eel,
// how many fish do you have left? How many aquariums do you need if you can put 30 fish per aquarium?
    println(2.plus(71).plus(233).minus(13).div(30).plus(1))
    println((2 + 71 + 233 - 13) / 30)
}

fun colors(){
//Create a String variable rainbowColor, set its color value, then change it.
//Create a variable blackColor whose value cannot be changed once assigned. Try changing it anyway.
    var rainbowColor: String = "red"
    println(rainbowColor)
    rainbowColor = "blue"
    println(rainbowColor)

    val blackColor = "black"
    println(blackColor)
}

fun nullability (){
//Try to set rainbowColor to null. Declare two variables, greenColor and blueColor.
//Use two different ways of setting them to null.
    var greenColor: String? = null
    var blueColor = null

//Create a list with two elements that are null; do it in two different ways.
//Next, create a list where the list is null.
    var names: List<String?> = listOf(null, null)
    var places: List<String> = emptyList()
    var animals: List<String>? = null

//Create a nullable integer variable called nullTest, and set it to null.
// Use a null-check that increases the value by one if it's not null,
// otherwise returns 0, and prints the result.
    var nullTest: Int? = null
    println(nullTest?.inc() ?:0)

    var myName: String? = null
    println(myName?.plus(" bear") ?: "bull")

}

fun age(age: Int){
    when(age){
        in 0..17 -> println("Too young!")
        in 18..35 -> println("Perfect!")
        else -> println("Too old!")
    }
}