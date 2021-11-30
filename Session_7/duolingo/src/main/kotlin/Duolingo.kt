class Duolingo {
    val words = mutableListOf<Word>(
        Word("hallo", "hello", "Engels"),
        Word("hallo", "bonjour","Frans"),
    )
    fun play() {
        words.random()
    }
}