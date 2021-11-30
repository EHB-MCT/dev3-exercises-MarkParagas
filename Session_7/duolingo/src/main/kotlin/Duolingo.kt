class Duolingo {
    // val words: MutableList<Word>
    val words = mutableListOf<Word>(
        Word("hallo", "hello", "engels"),
        Word("hallo", "bonjour", "frans"),
        Word("hallo", "hallo", "german"),
        Word("hallo", "ola", "spaans"),
        Word("hallo", "privet", "Russisch"),
    )

    fun play() {
        // val randomWords = words.random()

        val currentWords = words.take(5) .toMutableSet()//[Take] It will take five words in the sets
        // toMutableSet() able to change
        println(currentWords.count())

        while (currentWords.isNotEmpty()) { // Repeat process = (currentWords.count() > 0 )
            val selectedWord = currentWords.random() // randomise
            println("What is the translation of ${selectedWord.original} in ${selectedWord.language}  ") // " ${} "

            val userAnswer = readLine() // Write the answer of the user

            if (userAnswer == selectedWord.translated) {
                currentWords.remove(selectedWord)// Correct
            } 
            println(currentWords.count())
        }
        println("Congrats, you did it :D")
    }
}