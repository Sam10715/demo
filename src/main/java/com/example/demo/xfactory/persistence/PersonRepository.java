package com.example.demo.xfactory.persistence;

import com.example.demo.xfactory.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
