package com.ejemplo.personapi.dog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DogService {

    private final DogRepo repo;

    private Dog init(DogDto dto) {
        Dog dog = new Dog();
        dog.setName(dto.getName());
        dog.setBreed(dto.getBreed());
        dog.setYears(dto.getYears());
        dog.setWeight(dto.getWeight());
        return dog;
    }

    public Dog create(DogDto dto) {
        return repo.save(init(dto));
    }

    public List<Dog> list() {
        return repo.findAll();
    }
}
