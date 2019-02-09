
fun main(args: Array<String>){
    testArrays()

    divisibleByNumber(7)
}

fun testArrays(){
    var numbers: List<Int> = listOf<Int>(11, 12, 13, 14, 15)
    var names = mutableListOf<String>()
    for (number in numbers){
        names.add(number.toString())
    }
    println(names)
}

fun divisibleByNumber(number: Int){
    var divisibleByN: MutableList<Int> = mutableListOf<Int>()
    for (i in 0..100){
        if(i.mod(number) == 0){
            divisibleByN.add(i)
        }
    }
    println(divisibleByN)
    divisibleByN.clear()

    for (i in 0..100 step number) divisibleByN.add(i)
    println(divisibleByN)
}