package com.ejemplo.personapi;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/public/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;

    @GetMapping
    public ResponseEntity<List<Person>> list() {
        return new ResponseEntity(service.list(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Person> create(@Valid @RequestBody PersonDto dto) {
        return new ResponseEntity(service.create(dto), HttpStatus.CREATED);
    }
}
