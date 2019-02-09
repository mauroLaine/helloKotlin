
fun main(args: Array<String>){
    canAddFish(10.0, listOf(3,3,3))
    canAddFish(8.0, listOf(2,2,2), hasDecorations = false)
    canAddFish(9.0, listOf(1,1,3), 3)
    canAddFish(10.0, listOf(), 7, true)
}


fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true){
    println("*********************")
    println(currentFish.sum())
    val tankCapacity: Double = tankSize * if(hasDecorations).80 else 1.0
    println(tankCapacity)
    println(currentFish.sum() + fishSize <= tankCapacity)
}
