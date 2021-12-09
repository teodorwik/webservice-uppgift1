package com.example.webserviceuppgift1;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/person")
public class PersonController {
    PersonService personService;
    PersonRepository personRepository;

    @PostMapping("/create")
    public PersonEntity create(@Valid @RequestBody PersonEntity person){
        person.setId(UUID.randomUUID().toString());
        return personRepository.save(person);
    }

    /*public String delete(@PathVariable(value = "id")String id){
     return personService.delete(id);
    }*/
}
