package com.example.demo.xfactory.controller;

import com.example.demo.xfactory.model.Person;
import com.example.demo.xfactory.persistence.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Component
@Transactional
public class PersonService {
    @Autowired
    PersonRepository personRepository;


    public Person  save(Person s) {
        return personRepository.save(s);
    }

    public Optional<Person> findById(Long aLong) {
        return personRepository.findById(aLong);
    }

    public Iterable<Person> findAll() {
        return personRepository.findAll();
    }

    public void deleteById(Long aLong) {
        personRepository.deleteById(aLong);
    }


}
