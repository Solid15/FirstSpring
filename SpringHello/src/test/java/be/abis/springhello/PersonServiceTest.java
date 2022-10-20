package be.abis.springhello;

import be.abis.springhello.model.Person;
import be.abis.springhello.service.PersonService;
import be.abis.springhello.service.PersonServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest                                 // @SpringBootTest required for autowiring successfully
public class PersonServiceTest {

    @Autowired
    PersonService personService;

    /*
    @BeforeEach
    void setUp() {
        personService = new PersonServiceImpl();
    }
    */


    @Test
    void person1Is42() {
        Person person = personService.findPerson(1);
        assertEquals(42, person.getAge());
    }

}
