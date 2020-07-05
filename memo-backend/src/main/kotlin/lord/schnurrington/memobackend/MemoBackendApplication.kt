package lord.schnurrington.memobackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class MemoBackendApplication

fun main(args: Array<String>) {
	runApplication<MemoBackendApplication>(*args)
}