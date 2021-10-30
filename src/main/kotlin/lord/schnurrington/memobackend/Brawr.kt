package lord.schnurrington.memobackend

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

data class Brawr(val id: Long, val content: String)

@RestController
class BrawrController {
    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Brawr {
        return Brawr(counter.incrementAndGet(), "Braawwwwr $name")
    }
    
    @GetMapping("/home")
    fun home(): Brawr {
        //TODO: implement Backend for Homepage
        return Brawr(counter.incrementAndGet(), "you entered the Homepage")
    }
    
    @GetMapping("/tasks")
    fun tasks(): List<Brawr> {
        //TODO: implement Backend for Homepage
        return listOf(Brawr(counter.incrementAndGet(), "you entered the TaskList"))
    }
}
