fun main() {
    val personRand = arrayOf(Person("Mark"),Person("Jason"))
    // val Persons: Arrays<Person> => Kotlin See
    // val Persons = arrayOf("Mark","Jason") => Works with strings

    val persons = personRand.random() // Add dot Random to person "random()" to randomise

    persons.introduce()
}