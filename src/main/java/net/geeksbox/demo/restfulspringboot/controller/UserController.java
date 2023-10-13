package net.geeksbox.demo.restfulspringboot.controller;

import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
@Api(value = "Order Management API", tags = "Orders")
public class UserController {

    @Autowired
    private UserRepository userRepository;

  
    @PostMapping("/dangky")
    public ResponseEntity<?> register(@RequestBody User user) {
        Optional<User> existingOrder = userRepository.checkemail(user.getEmail());
        if (existingOrder.isPresent()) {
          
            return ResponseEntity.badRequest().body("email exits");
        } else {
            try {
            	User savedUser = userRepository.save(user);
                return ResponseEntity.ok(savedUser);
            } catch (DataAccessException e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Lỗi khi lưu");
            }
        }
    }
    @GetMapping("/login")
    public User login(@RequestParam("email") String username,@RequestParam("password_hash") String hash_password ) {
        return userRepository.checkAccount(username, hash_password);
    }	
   
    
}
