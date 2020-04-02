package com.ejemplo.personapi.dog;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepo extends CrudRepository<Dog, Long> {

    @Query("select d from Dog d")
    List<Dog> findAll();
}
