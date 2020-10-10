package lord.schnurrington.memobackend

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.client.match.MockRestRequestMatchers.content
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.web.servlet.function.RequestPredicates.contentType

@SpringBootTest
@AutoConfigureMockMvc
internal class BrawrControllerTest {

    @Autowired
    private lateinit var mvc: MockMvc

    @Test
    fun greeting() {
        mvc.perform(MockMvcRequestBuilders.get("/greeting").requestAttr("name", "Nemo"))
                .andExpect {
                    status().isOk
                    content().contentType(MediaType.APPLICATION_JSON)
                }
    }

    @Test
    fun home() {
        mvc.perform(MockMvcRequestBuilders.get("/home"))
                .andExpect {
                    status().isOk
                    content().contentType(MediaType.APPLICATION_JSON)
                }
    }

    @Test
    fun tasks() {
        mvc.perform(MockMvcRequestBuilders.get("/tasks"))
                .andExpect {
                    status().isOk
                    content().contentType(MediaType.APPLICATION_JSON)
                }
    }
}