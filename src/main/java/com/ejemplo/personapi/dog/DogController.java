package com.ejemplo.personapi.dog;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/public/dog")
@RequiredArgsConstructor
public class DogController {

    private final DogService service;

    @GetMapping
    public ResponseEntity<List<Dog>> list() {
        return new ResponseEntity(service.list(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Dog> create(@Valid @RequestBody DogDto dto) {
        return new ResponseEntity(service.create(dto), HttpStatus.CREATED);
    }
}
