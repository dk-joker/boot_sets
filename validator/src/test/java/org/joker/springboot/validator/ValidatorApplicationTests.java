package org.joker.springboot.validator;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.joker.springboot.validator.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ValidatorApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void should_get_person_correctly() throws Exception {
        Person person = new Person();
        person.setName("dk");
        person.setSex("Man");
        person.setClassId("2011031030");
        person.setEmail("18200250936@163.com");

        mockMvc.perform(post("/api/person")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(objectMapper.writeValueAsString(person)))
                .andExpect(MockMvcResultMatchers.jsonPath("name").value("dk"))
                .andExpect(MockMvcResultMatchers.jsonPath("classId").value("2011031030"))
                .andExpect(MockMvcResultMatchers.jsonPath("sex").value("Man"))
                .andExpect(MockMvcResultMatchers.jsonPath("email").value("18200250936@163.com"));
    }
}
