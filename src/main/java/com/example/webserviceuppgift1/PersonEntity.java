package com.example.webserviceuppgift1;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
public class PersonEntity {
    @Id
    String id;
    String firstName;
    String lastName;


    public PersonEntity(String id, String firstName, String lastName) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
