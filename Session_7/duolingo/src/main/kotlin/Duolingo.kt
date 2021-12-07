class Duolingo ( // <= constructor
    var rounds: Int = 0, // default = 5
    var language: String = "en", // default = en / english
    var difficulty: Int = 1 // Default number: always 1
)
{
    var words = mutableListOf<Word>(
        EnglishWord("hello", "hallo"),
        EnglishWord("goodmorning", "goedemorgen"),
        EnglishWord("you", "jij"),
        EnglishWord("me", "ik"),
        EnglishWord("he", "hij"),

        GermanWord("hey", "hallo"),
        GermanWord("guten morgen", "goedemorgen"),
        GermanWord("Sie", "jij"),
        GermanWord("mich", "ik"),
        GermanWord("er", "hij")
    )

    // filteren van language | [it] expect same type

    init { // choose levels between easy or hard
        words = words.filter {it.language == language}.toMutableList()
        words = words.filter {it.difficulty == difficulty}.toMutableList()

        println("Choose difficulty easy or hard")
        val choice = readLine()
        // Choose Easy or Difficult
        if (choice == "easy"){
            rounds = 5
        } else if (choice == "hard"){
            rounds = 10}
        else {
            throw Exception("You didnt type the selected words: 'easy' or 'hard'") // Works it gives written errors in console => println("You didn't type the selected words: 'easy' or 'hard'")
            // main() // Return
        }

        // if & else statement works & rounds difficulties
        // filteren van language | [it] expect same type
        // words = words.filter {it.language == language}.toMutableList()

    }



    fun play() {
        // val randomWords = words.random()
        // val numberOfWords = roundSize

        val currentWords = words.take(rounds).toMutableSet()//[Take] It will take five words in the sets
        // toMutableSet() able to change
        println(currentWords.count())

        while (currentWords.isNotEmpty()) { // Repeat process = (currentWords.count() > 0 )
            val selectedWord = currentWords.random() // randomise
            println("What is the translation of ${selectedWord.original}") // " ${} "

            val userAnswer = readLine() // Write the answer of the user


            // If usersAnswer = correct it drop by -1 level
            if (userAnswer == selectedWord.translated) {
                currentWords.remove(selectedWord)// Correct
                selectedWord.difficulty--
            } else { // If usersAnswer = wrong it raise by +2 level
                // throw Exception("You type it wrong")
                selectedWord.difficulty++
            }
            println(currentWords.count())
        }
        println("Congrats, it works")
        Duolingo()
    }
}