package game


fun main(args: Array<String>){

    val game = Game()
    var play = true
    while (play) {
        print("Enter a direction: n/s/e/w: \n")
        val move = readLine()
        play = game.makeMove(move)
    }
}

class Game {
    val map = hashMapOf<String, List<String>>()

    init {
        map.set("school",  listOf<String>("n", "w", "n"))
        map.set("table",  listOf<String>("s", "e", "s"))
        map.set("restaurant",  listOf<String>("e", "e", "e"))
        map.set("library",  listOf<String>("s", "s", "s"))
    }

    var playerMoves = mutableListOf<String?>()
    var path = mutableListOf<Directions>(Directions.START)
    val north = {path.add(Directions.NORTH)}
    val south = {path.add(Directions.SOUTH)}
    val west = {path.add(Directions.WEST)}
    val east = {path.add(Directions.EAST)}

    val end = {
        path.add(Directions.END)
        println("Game Over $path")
        path.clear()
        false }

    fun makeMove(movement: String?): Boolean {
        if(movement.isNullOrEmpty()){
            move(end)
            return false
        }
        if(movement.equals("n")){
            move(north)
        } else if (movement.equals("s")){
            move(south)
        } else if (movement.equals("w")){
            move(west)
        } else if (movement.equals("e")){
            move(east)
        }
        updateLocation(movement)
        return true
    }

    fun updateLocation(movement: String?){
        playerMoves.add(movement)
        for ((key, route) in map){
            if(playerMoves.equals(route)){
                println("You are in the $key")
            }
        }
    }
}

fun move(where: () -> Boolean){
    run(where)
}
