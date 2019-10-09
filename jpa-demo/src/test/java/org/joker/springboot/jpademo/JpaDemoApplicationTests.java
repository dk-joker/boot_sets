package org.joker.springboot.jpademo;

import org.joker.springboot.jpademo.entity.Person;
import org.joker.springboot.jpademo.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Properties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaDemoApplicationTests {
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void jpaTest() {
        Person person = new Person("dk_joker", 25);
        personRepository.save(person);
        Person person1 = personRepository.findByName("dk_joker").get();
        System.out.println(person1.toString());
        Person person2 = personRepository.findByNameAndAge("dk_joker", 25).get();
        System.out.println(person2.toString());
    }

}
