package be.abis.springhello.service;

import be.abis.springhello.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceImpl implements PersonService {               // @Component creates a singleton


    @Override
    public Person findPerson(int id) {
        return new Person("Sandy", 42);
    }

    @Override
    public void sayHelloToPerson(Person person) {
        System.out.println("Hello");
    }
}
