fun main() {
    val personRand = arrayOf(Student("Mark"),Teacher("Mike"),Comedian("Jason"))

    val persons = personRand.random()

    persons.introduce()
    persons.talk()
}