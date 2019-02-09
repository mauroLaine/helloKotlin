

fun main(args: Array<String>){

    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
    println(numbers.filter { it.rem(3) == 0 })

    print(numbers.divisibleBy { it.rem(3) })

}

//avoiding creatung a new lambda object
inline fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}