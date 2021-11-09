class Student(override val name: String): Person(name) {
    override fun talk(){
        gossip()
    }

    fun gossip() {
        println("There is french fries in resto")
    }
}
