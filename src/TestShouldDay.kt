
fun main(args: Array<String>){

    val mood: String = readLine().toString()
    whatShouldIDoToday(mood)
    whatShouldIDoToday("happy", "cloudy")
    whatShouldIDoToday("happy", temperature = 25)
}


fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24){
    if(mood == "sad") println("Stay home and read.")
    else if (mood == "happy" && weather == "sunny" && temperature < 10 ) println("Let's go to dance.")
    else if (weather == "sunny") println("Run!")
    else println("Let's code!!!")
    println(when {
        stayHome(mood) -> "Stay home and read."
        goDance(mood, weather, temperature) -> "Let's go to dance."
        run(weather) -> "Run!"
        swimming(temperature) -> "Go swimming!"
        else -> "Let's code!!!"
    })
}

fun stayHome(mood: String): Boolean = mood == "sad"
fun goDance(mood: String, weather: String, temperature: Int):Boolean = mood == "happy" && weather == "sunny" && temperature < 10
fun run(weather: String): Boolean = weather == "sunny"
fun swimming(temperature: Int): Boolean = temperature > 25