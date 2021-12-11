package com.example.webserviceuppgift1;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
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
    public PersonEntity createPerson(@Valid @RequestBody PersonEntity person){
        person.setId(UUID.randomUUID().toString());
        return personRepository.save(person);
    }

    /*@DeleteMapping("/delete/{id}")
    public Map<String, Boolean> deletePerson(@PathVariable(value = "id") String id){
     return personService.deletePerson(id);
    }*/

    @PutMapping
    public ResponseEntity<PersonEntity> updatePerson(@PathVariable(value = "id") String id, @Valid @RequestBody PersonEntity person) throws Exception{
        final PersonEntity updatePerson = personService.getPersonEntity(id, person);
        return ResponseEntity.ok(updatePerson);
    }
}
