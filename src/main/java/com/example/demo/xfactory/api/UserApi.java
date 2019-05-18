package com.example.demo.xfactory.api;

import com.example.demo.xfactory.controller.UserService;
import com.example.demo.xfactory.model.Authority;
import com.example.demo.xfactory.model.Person;
import com.example.demo.xfactory.model.User;
import com.example.demo.xfactory.persistence.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/users")
public class UserApi {

    @Autowired
    private UserService userService;
    @Autowired
    private AuthorityRepository authorityRepository;

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody @Valid User user) {
        Authority authority = user.getAuthorities().get(0);
        authorityRepository.save(authority);

        userService.save(user);
        return ResponseEntity.ok(user);

    }



}
