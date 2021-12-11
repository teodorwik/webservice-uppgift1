package com.example.webserviceuppgift1;

import lombok.Getter;

@Getter
public class PersonDTO {
    String id;
    String firstName;
    String lastName;
    String groups;

    public PersonDTO(String id, String firstName, String lastName, String groups) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.groups = groups;
    }
}
