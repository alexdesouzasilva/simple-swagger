package br.com.bradesco.simple_swagger.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import br.com.bradesco.simple_swagger.service.SimpleSwaggerService;

@WebMvcTest(controllers = SimpleSwaggerController.class)
public class SimpleSwaggerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SimpleSwaggerService service;

    @Test
    public void testHelloEndpoint() throws Exception {
        // Configurar o comportamento quando simulado
        when(service.hello()).thenReturn("Hello Service");

        // Executar uma requisição GET ao endpoint /api/hello

        mockMvc.perform(get("/api/hello"))
        .andExpect(status().isOk())
        .andExpect(content().string("Hello Service"));
    }
    
}
