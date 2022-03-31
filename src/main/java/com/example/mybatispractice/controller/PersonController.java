package com.example.mybatispractice.controller;

import com.example.mybatispractice.dto.PersonDto;
import com.example.mybatispractice.service.PersonService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public ResponseEntity AllPersons() {
        return new ResponseEntity(personService.getAllPersons(), HttpStatus.OK);
    }

    @PutMapping("/person")
    @ResponseBody
    public String AddPerson(@RequestBody PersonDto personDto) {
        personService.addPerson(personDto);
        return "this is put mapping example. + \n" + personDto.toString();
    }
}
