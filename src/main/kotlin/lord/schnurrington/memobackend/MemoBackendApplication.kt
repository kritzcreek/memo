package lord.schnurrington.memobackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.jetbrains.exposed.sql.Database

@SpringBootApplication
class MemoBackendApplication

fun main(args: Array<String>) {
	val dbUrl = "jdbc:postgresql://localhost:5432/memodb"
	val dbUser = "nemo"
	val dbPass = "nemo"

	Database.connect(dbUrl, driver = "org.postgresql.Driver", user = dbUser, password = dbPass)
	runApplication<MemoBackendApplication>(*args)
}