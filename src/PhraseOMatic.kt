import kotlin.random.Random

fun main () {

    var arrayOne = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    var arrayTwo = arrayOf("empowered", "leveraged", "aligned", "targeted")
    var arrayThree = arrayOf("process", "paradigm", "solution", "portal", "vision")

    var x = Random.nextInt(0, 4)
    var y = Random.nextInt(0, 3)
    var z = Random.nextInt(0, 4)


    print(arrayOne[x])
    print(" ")
    print(arrayTwo[y])
    print(" ")
    print(arrayThree[z])

}