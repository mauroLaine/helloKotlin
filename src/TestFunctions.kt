

fun main(args: Array<String>){
    var fortune: String = ""
//    for (i in 1..10) {
//        fortune = getFortuneCookie()
//        println("$i - $fortune")
//        if( fortune.contains("Take it easy")) break
//    }

    while (fortune.contains("Take it easy")) {
        fortune = getFortuneCookie()
        println("- $fortune")
    }
}

fun getBirthday(): Int{
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortuneCookie () :String{
    val fortunes = listOf<String>(
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")
    val birthday = getBirthday()
//    val index = when (birthday) {
//        in 1..7 -> 4
//        28, 31 -> 2
//        else -> birthday.rem(fortunes.size)
//    }
    return when(birthday){
        in 1..4 -> fortunes[0]
        in 5..8 -> fortunes[1]
        in 9..12 -> fortunes[2]
        in 13..16 -> fortunes[3]
        in 17..20 -> fortunes[4]
        in 21..24 -> fortunes[5]
        in 25..28 -> fortunes[6]
        else -> fortunes[birthday.rem(fortunes.size)]
    }
}