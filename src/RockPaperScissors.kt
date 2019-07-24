import kotlin.random.Random

//Failed attempt without functions


fun main(){

        println("Welcome to Rock, Paper, Scissors!")
        println()
        println("Please type in Rock, Paper, or Scissors (case sensitive). You are going against the computer.")
        println()
        println("Player: ")


        var computer = arrayOf("Rock", "Paper", "Scissors")
        //c = Computer input
        var c = Random.nextInt(0, 2)

        //p = Player input
        val p = readLine()


        //The first input is the computer's and the second input is the player's
        //For example, "Rock and Scissors". Rock is the computer's input and Scissors is the player's input.
        //This applies for every else if loop (except the last three.)


        if (c == 0 && p == "Scissors") {
            //Rock and Scissors
            print("Computer: ")
            println(computer[c])
            print("You lose!")

        } else if (c == 0 && p == "Paper") {
            //Rock and Paper
            print("Computer: ")
            println(computer[c])
            print("You win!")
        } else if (c == 0 && p == "Rock") {
            //Rock and Rock
            print("Computer: ")
            println(computer[c])
            print("Tie")

        } else if (c == 1 && p == "Scissors") {
            //Paper and Scissors
            print("Computer: ")
            println(computer[c])
            print("You win!")

        } else if (c == 1 && p == "Paper") {
            //Paper and Paper
            print("Computer: ")
            println(computer[c])
            print("Tie")

        } else if (c == 1 && p == "Rock") {
            //Paper and Rock
            print("Computer: ")
            println(computer[c])
            print("You lose!")

        } else if (c == 2 && p == "Scissors") {
            //Scissors and Scissors
            print("Computer: ")
            println(computer[c])
            print("Tie")

        } else if (c == 2 && p == "Paper") {
            //Scissors and Paper
            print("Computer: ")
            println(computer[c])
            print("You lose!")

        } else if (c == 2 && p == "Rock") {
            //Scissors and Rock
            print("Computer: ")
            println(computer[c])
            print("You win!")

        }

        //If the player's input is not Rock, Paper, or Scissors
        else if (p != "Rock") {
            print("Sorry, that is not a valid input.")
        } else if (p != "Paper") {
            print("Sorry, that is not a valid input.")
        } else if (p != "Scissors") {
            print("Sorry, that is not a valid input.")
        }


        //More Messages


    }









