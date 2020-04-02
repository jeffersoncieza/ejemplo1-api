package com.ejemplo.personapi;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepo extends CrudRepository<Person, Long> {

    @Query("select p from Person p")
    List<Person> findAll();
}
