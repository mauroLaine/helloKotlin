import java.util.*

fun main(args: Array<String>){
    dayOfWeek()
    greeting(args[0])

    println(when(args[0].toInt()){in 1..12 -> "Good morning, Kotlin" else -> "Good night, Kotlin" })
    println(if (args[0].toInt() < 12) "Good Morning, Kotlin" else "Good Night Kotlin")
}

fun greeting(value: String){
    val hour = value.toInt()
    when(hour){
        in 1..12 -> println("Good morning, Kotlin")
        else -> println("Good night, Kotlin")
    }

}

fun dayOfWeek(){
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when(day){
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> ""
    })
}