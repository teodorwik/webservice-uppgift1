package com.example.webserviceuppgift1;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, String> {
    List<PersonEntity> findByName(String firstName);

}
