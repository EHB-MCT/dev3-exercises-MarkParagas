class Duolingo ( // <= constructor
    val roundSize: Int = 5, // default = 5
    val language: String = "en") // default = en / english
{
    var words = mutableListOf<Word>( // var gebruiken
        Word("hello", "hallo", "en"),
        Word("goodmorning", "goedemorgen", "en"),
        Word("you", "jij", "en"),
        Word("me", "ik", "en"),
        Word("he", "hij", "en"),
        Word("hey", "hallo", "ge"),
        Word("guten morgen", "goedemorgen", "ge"),
        Word("Sie", "jij", "ge"),
        Word("mich", "ik", "ge"),
        Word("er", "hij", "ge")
    )

    init { // filteren van language | [it] expect same type
        words = words.filter {it.language == language}.toMutableList()
    }

    // List = recepts (exmaple) orders
    // Sets = everything is unique


    // val words = mutableListOf<Word>()
    fun play() {
        // val randomWords = words.random()
        // val numberOfWords = roundSize

        val currentWords = words.take(roundSize) .toMutableSet()//[Take] It will take five words in the sets
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
        println("Congrats, it works")
    }
}