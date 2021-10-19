class Comedian(override val name: String): Person(name) {
    override fun talk(){
        tellJoke()
    }
    fun tellJoke() {
        println("Every market in Africa is Black market")
    }
}