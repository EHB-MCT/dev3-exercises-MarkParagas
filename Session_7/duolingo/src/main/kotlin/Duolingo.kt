class Duolingo {
    // val words: MutableList<Word>
    val words = mutableListOf<Word>(
        Word("hallo", "hello", "engels"),
        Word("hallo", "bonjour", "frans"),
        Word("hallo", "hallo", "german"),
        Word("hallo", "Ola", "spaans"),
        Word("hallo", "Privet", "Russisch"),
    )

    fun play() {
        val randomWords = words.random()
        println(randomWords.original)
        println("What is the translation? Of")
        println(randomWords.language)

        val userAnswer = readLine() // Write the answer of the user
        if (userAnswer == randomWords.translated) {
            println("Correct")
        } else {
            println("Wrong")
        }
    }
}