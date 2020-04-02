package com.ejemplo.personapi;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepo repo;

    private Person init(PersonDto dto) {
        Person p = new Person();
        p.setName(dto.getName());
        p.setTitle(dto.getTitle());
        p.setSalary(dto.getSalary());

        return p;
    }

    public Person create(PersonDto dto) {
        return repo.save(init(dto));
    }

    public List<Person> list() {
        return repo.findAll();
    }
}
