import kotlin.random.Random

//Successful attempt with functions

fun displayWelcomeMessage() {
    println("Please enter one of the following numbers:")
    println("1 - Rock")
    println("2 - Paper")
    println("3 - Scissors")
    print("Enter your selection: ")
}

fun restartGame() {
    var a = readLine()
    if (a == "Yes") {
        displayWelcomeMessage()
        val userChoice = readLine()?.toInt() ?: 0
        val aiChoice = Random.nextInt(1, 3)
        playGame(userChoice, aiChoice)

    }
    else if (a == "No") {
        println("Thank you for playing!")
    }
}

fun main(){

    println("Welcome to Rock, Paper, Scissors!")
    displayWelcomeMessage()

        val userChoice = readLine()?.toInt() ?: 0
        val aiChoice = Random.nextInt(1, 3)
        playGame(userChoice, aiChoice)
    }

fun playGame(userChoice: Int, aiChoice: Int) {
    println("You chose ${userChoice} and the AI chose ${aiChoice}.")
    val result = when (userChoice) {
        aiChoice -> "You tied!"
        1 -> if (aiChoice == 2) "You lose!" else "You won!"
        2 -> if (aiChoice == 3) "You lose!" else "You won!"
        3 -> if (aiChoice == 1) "You lose!" else "You won!"
        else -> "Error - Invalid Input"
    }
    println(result)
    println("Play again? (Yes or No)")
    restartGame()


}
