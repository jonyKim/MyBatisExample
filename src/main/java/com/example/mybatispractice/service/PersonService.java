package com.example.mybatispractice.service;

import java.util.List;

import com.example.mybatispractice.dto.PersonDto;
import com.example.mybatispractice.mapper.PersonMapper;
import com.example.mybatispractice.payload.DefaultRes;
import com.example.mybatispractice.payload.ResponseMessage;
import com.example.mybatispractice.payload.StatusCode;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonMapper personMapper;

    public PersonService(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    public DefaultRes getAllPersons() {
        final List<PersonDto> personList = personMapper.findAll();
        if (personList.isEmpty())
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);
        return DefaultRes.res(StatusCode.OK, ResponseMessage.READ_USER, personList);
    }

    public void addPerson(PersonDto personDto) {
        personMapper.save(personDto.getName(), personDto.getAge(), personDto.getAddress());
    }
}
