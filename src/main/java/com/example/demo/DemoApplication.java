package com.example.demo;

import com.example.demo.xfactory.model.Authority;
import com.example.demo.xfactory.model.AuthorityName;
import com.example.demo.xfactory.model.User;
import com.example.demo.xfactory.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {
	@Autowired
	 UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}



}
