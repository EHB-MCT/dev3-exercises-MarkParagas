fun main(){
    println("Which country has black, yellow and red flag?");
    challengeOne()
}

fun challengeOne(){
    // TODO: (Error) Val correctAnswer = setOf<string>("Belgium", "German")
    val correctAnswer = setOf<string>("Belgium", "German")
    val playerAnwser = readLine();
    if (playerAnwser == correctAnswer){ // if equal
        println("Correct answer!")
        main()
    }
    if (playerAnwser != correctAnswer){ // if not equal (can't use 'else')
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
