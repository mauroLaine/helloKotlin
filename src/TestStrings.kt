fun main(args: Array<String>) {
    var troutFish = "trout"
    var haddockFish = "haddock"
    var snapperFish = "snapper"

    println("Let's see our options: $troutFish, $haddockFish, and $snapperFish")
    eatFish(troutFish)
    eatFish(haddockFish)
    eatFish(snapperFish)


    fishName("Bob")
    fishName("Wu")
    fishName("")
}

fun eatFish(fish: String){
//Create three String variables for trout, haddock, and snapper.
//Use a String template to print whether you do or don't like to eat these kinds of fish.

    if(fish == "snapper"){
        println("$fish: I do not want to eat this fish! ")
    } else {
        println("$fish: I want to eat it")
    }
}

fun fishName(fishName: String){
//    Create a when statement with three comparisons:
//    If the length of the fishName is 0, print an error message.
//    If the length is in the range of 3...12, print "Good fish name".
//    If it's anything else, print "OK fish name".
    when(fishName.length){
        0 -> println("No good!")
        in 3..12 -> println("Good fish name!")
        else -> println("Ok fish name")
    }

}
