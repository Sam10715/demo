package com.example.demo.xfactory.api;

import com.example.demo.xfactory.controller.PersonService;
import com.example.demo.xfactory.model.Person;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import javax.validation.Valid;


import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT,RequestMethod.OPTIONS})
@RestController
@RequestMapping("api/people")
public class PersonApi {



    @Autowired
    private PersonService personService;




    @PostMapping
    public ResponseEntity<Person> savePerson(@RequestBody @Valid Person person) {


        personService.save(person);
        return ResponseEntity.ok(person);

    }

    @GetMapping
    public ResponseEntity<Iterable<Person>> findAll() {
        Iterable<Person> personIterable = personService.findAll();
        return ResponseEntity.ok(personIterable);
    }

    @DeleteMapping("{id}")
    public void deletePerson(@PathVariable long id) {
        personService.deleteById(id);

    }

    @PutMapping("{id}")
    public ResponseEntity<Person> update(@PathVariable long id, @RequestBody @Valid Person input) {

        Optional<Person> optionalPerson = this.personService.findById(id);
        if (optionalPerson.isPresent()) {
            Person target = optionalPerson.get();
//            target.setAge(input.getAge());
            BeanUtils.copyProperties(input, target);
            // and so forth ... // Samer fix this
            this.personService.save(target);
            return ResponseEntity.accepted().body(target);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
