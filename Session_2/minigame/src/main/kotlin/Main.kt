fun main(){
    println("Which country has black, yellow and red flag?");

    challengeOne()
}

fun challengeOne(){
    val correctAnswer = setOf<Strings>("Belgium", "German")
    val playerAnwser = readLine();
    if (playerAnwser == correctAnswer){ // if equal
        println("Correct answer!")
        main()
    }
    else (playerAnwser != correctAnswer){ // if not equal
        gameOver()
    }

}

fun gameOver() {
    println("Game Over");
    println("Try Again?");
    println("Type 'Yes'");

    val playerAnwser = readLine();
    if (playerAnwser == "Yes"){
        main()
    }
}
