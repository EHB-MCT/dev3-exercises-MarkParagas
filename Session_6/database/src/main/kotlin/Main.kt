import java.sql.*
import java.util.*

fun main() {
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = Credentials()
    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePassword
    // Create the connection: this will allow us to run queries on it later
    val connection = DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                credentials.databaseHost +
                ":" + credentials.databaseDefault + "/" +
                credentials.databaseName,
        connectionProps
    )

    // Get data (Testing)
    fun getData(string: String): ResultSet {
        val statement = connection.prepareStatement(string)
        return statement.executeQuery()
    }

    // [Database - Tags]
    val dataTags = getData("SELECT * FROM tags")

    println("list of genres")

    while(dataTags.next()) { // while = Loop
        println("${dataTags.getString("id")} ${dataTags.getString("name")}")
    }

    // [Database - Travels [MAIN]]
    val dataTravels = getData("SELECT * FROM travels")

    while(dataTravels.next()) {
        println("Destination ${dataTravels.getString("id")}:${dataTravels.getString("destination")}")
        println("Info: ${dataTravels.getString("description")}")
    }
    /*
    NOTE: Getting data from database works!
    NEXT: Insert typed data and transfer to database
     */

}