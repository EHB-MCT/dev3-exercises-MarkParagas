open class Person(
    open val name: String
    ) {
    fun introduce() {
        println("Hallo, mijn name is ${name}")
    }
    open fun talk(){

    }

}