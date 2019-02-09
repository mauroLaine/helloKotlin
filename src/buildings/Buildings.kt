package buildings

import java.awt.Color

open class BaseBuildingMaterial() {
    open val numberNeeded:Int = 1
    open var color = "grey"
}

class Wood: BaseBuildingMaterial() {
    override val numberNeeded: Int = 4
    override var color = "brown"
}
class Brick: BaseBuildingMaterial() {
    override val numberNeeded: Int = 8
    override var color = "red"
}

class Building<out T: BaseBuildingMaterial> (val material: BaseBuildingMaterial) {
    val baseMaterialsNeeded: Int = 100
    val actualMaterialsNeeded = baseMaterialsNeeded * material.numberNeeded

    fun build() = println("$actualMaterialsNeeded ${material::class.simpleName} required.")
}

fun paintBuilding(building: Building<BaseBuildingMaterial>, color: String){
    building.material.color = color
}

fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>){
    if(building.actualMaterialsNeeded < 500) println("small building")
    else println("large building")
}

fun main(args: Array<String>){

    val building = Building<Wood>(Wood())
    building.build()
    paintBuilding(building, "green")
    println(building.material.color)
    isSmallBuilding(building)
    isSmallBuilding(Building<Brick>(Brick()))


    myloop@ for (i in 0..20) {
        println("i:$i")
        for (j in 0..30){
            if (j == 20) break@myloop
            println("j:$j")
        }
    }
}

