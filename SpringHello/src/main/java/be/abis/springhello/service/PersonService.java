package be.abis.springhello.service;

import be.abis.springhello.model.Person;

public interface PersonService {

    Person findPerson (int id);
    void sayHelloToPerson(Person person);


}
