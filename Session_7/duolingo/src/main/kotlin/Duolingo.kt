class Duolingo (
    val roundSize: Int,
    val language: String
    ) {

    val difficulty = setOf<Strings>("")

    // val words: MutableList<Word>
    val words = mutableListOf<Word>(
        Word("hello", "hallo", "en"),
        Word("goodmorning", "goedemorgen", "en"),
        Word("you", "jij", "en"),
        Word("me", "ik", "en"),
        Word("he", "hij", "en"),
        Word("hey", "hallo", "ge"),
        Word("guten morgen", "goedemorgen", "ge"),
        Word("Sie", "jij", "ge"),
        Word("mich", "ik", "ge"),
        Word("er", "hij", "ge"),
    )

    fun play() {
        // val randomWords = words.random()

        val currentWords = words.take(5) .toMutableSet()//[Take] It will take five words in the sets
        // toMutableSet() able to change
        println(currentWords.count())

        while (currentWords.isNotEmpty()) { // Repeat process = (currentWords.count() > 0 )
            val selectedWord = currentWords.random() // randomise
            println("What is the translation of ${selectedWord.original}") // " ${} "

            val userAnswer = readLine() // Write the answer of the user

            if (userAnswer == selectedWord.translated) {
                currentWords.remove(selectedWord)// Correct
            }
            println(currentWords.count())
        }
        println("Congrats, you did it :D")
    }
}