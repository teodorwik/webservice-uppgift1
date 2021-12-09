package com.example.webserviceuppgift1;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }
}
