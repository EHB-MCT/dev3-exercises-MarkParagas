open class Word(
    open val original: String,
    open val translated: String,
    val language: String,
    val difficulty: Int // Default number: always 1
) {
}
