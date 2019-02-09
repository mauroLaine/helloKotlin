import java.util.*

fun main(args:  Array<String>){

    var spices = listOf<String>("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    println(spices)
    println(spices.filter { it.contains("curry") }.sortedBy { it.length })
    println(spices.filter { it.startsWith("c").and(it.endsWith("e"))})
    println(spices.subList(0,3).filter { it.startsWith("c") })


    val rollDice = { Random().nextInt(12) + 1}
    val rollDice1 = { sides: Int ->
        Random().nextInt(sides) + 1
    }
    val rollDice0 = { sides: Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    gameplay(rollDice())
    gameplay(rollDice2(2))
}


fun gameplay(rollDice: Int){
    println(rollDice)
}