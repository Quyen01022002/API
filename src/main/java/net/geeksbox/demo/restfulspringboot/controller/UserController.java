package net.geeksbox.demo.restfulspringboot.controller;

import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    private UserRepository userRepository;

  
    @PostMapping("/dangky")
	public ResponseEntity<User> dangky(@RequestBody User user) {
    	User saveUser = userRepository.save(user);
	        return new ResponseEntity<>(saveUser, HttpStatus.CREATED);
	    }
   
    
}
