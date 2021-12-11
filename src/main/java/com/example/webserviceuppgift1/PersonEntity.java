package com.example.webserviceuppgift1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "person")
public class PersonEntity {
    @Id
    String id;
    String firstName;
    String lastName;
    String groups;


    public PersonEntity(String firstName, String lastName) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.groups = groups;
    }
}
