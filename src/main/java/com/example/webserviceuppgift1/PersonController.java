package com.example.webserviceuppgift1;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PersonController {
    PersonService personService;
}
