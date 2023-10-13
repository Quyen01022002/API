package net.geeksbox.demo.restfulspringboot.controller;

import net.geeksbox.demo.restfulspringboot.model.Picture_Of_PostEnity;
import net.geeksbox.demo.restfulspringboot.model.PostEnity;
import net.geeksbox.demo.restfulspringboot.model.PostEnityImg;
import net.geeksbox.demo.restfulspringboot.model.PostModel;
import net.geeksbox.demo.restfulspringboot.model.PostModelImg;
import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.PictureOfPostRepository;
import net.geeksbox.demo.restfulspringboot.repository.PostEnityRepository;
import net.geeksbox.demo.restfulspringboot.repository.PostModelRepository;
import net.geeksbox.demo.restfulspringboot.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class PostModelController {

    @Autowired
    private PostModelRepository postModelRepository;
    
    @Autowired
    private PictureOfPostRepository pictureOfPostRepository;
    @Autowired
    private PostEnityRepository postEnityRepository;
    
  
    @GetMapping("/listpost")
    public List<PostModelImg> ListPost(@RequestParam("userid") int userid) {
    	List<PostModel> listpost=postModelRepository.ListPost(userid);
    	List<PostModelImg>  listpostimg = new ArrayList<>();
    	for (PostModel item : listpost) {
    		PostModelImg postimg=new PostModelImg();
    		 List<Picture_Of_PostEnity> listimg = pictureOfPostRepository.PostImg(item.getPost_id());
    		 postimg.setPost(item);
    		 postimg.setListImg(listimg);
    		 listpostimg.add(postimg);
    	    
    	}
    	return listpostimg;
             
    }
    @PostMapping("/post")
    public ResponseEntity<PostEnity> post(@RequestBody PostEnity post ) {
    	
    	PostEnity savedpost = postEnityRepository.save(post);
    	
        return new ResponseEntity<>(savedpost, HttpStatus.CREATED);
    }
    @PostMapping("/postimages")
    public ResponseEntity<Picture_Of_PostEnity> images(@RequestBody Picture_Of_PostEnity img ) {
    	
    	Picture_Of_PostEnity savedpost = pictureOfPostRepository.save(img);
    	
        return new ResponseEntity<>(savedpost, HttpStatus.CREATED);
    }
   
    
}
