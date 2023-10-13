package net.geeksbox.demo.restfulspringboot.controller;

import net.geeksbox.demo.restfulspringboot.model.Interaction;
import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.InteractionsRepository;
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
public class InteractionsController {

    @Autowired
    private InteractionsRepository interactionsRepository;

  
    @PostMapping("/like")
    public ResponseEntity<?> like(@RequestBody Interaction interaction) {
    	Interaction liked=interactionsRepository.checkliked(interaction.getUser_id(), interaction.getPost_id());
    	if(liked==null)
    	{
    	Interaction savedProduct = interactionsRepository.save(interaction);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    	}
    	else
    	{
    		 interactionsRepository.delete(liked);

    		return new ResponseEntity<>(HttpStatus.OK);
    	}
       
    }
   
   
    
}
