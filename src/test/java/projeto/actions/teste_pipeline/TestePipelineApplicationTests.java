package projeto.actions.teste_pipeline;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.test.web.servlet.MockMvc;
import projeto.actions.teste_pipeline.controller.HelloWorldController;

@AutoConfigureMockMvc
@SpringBootTest
class TestePipelineApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@InjectMocks
	private HelloWorldController helloWorldController;

	@Test
	void callHello_WhenValidRequest_shouldReturnHelloWorld() throws Exception{

		mockMvc.perform(get("/hello"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").value("Hello World!"));
	}

}
