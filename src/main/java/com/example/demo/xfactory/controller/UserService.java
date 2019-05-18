package com.example.demo.xfactory.controller;

import com.example.demo.xfactory.model.User;
import com.example.demo.xfactory.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void save(User user) {
        this.userRepository.save(user);
    }

    public boolean authenticate(String username, String password) {
        return this.userRepository.findByUsernameAndPassword(username, password) != null;
    }
}
