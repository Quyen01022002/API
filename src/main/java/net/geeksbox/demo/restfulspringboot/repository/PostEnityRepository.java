package net.geeksbox.demo.restfulspringboot.repository;

import net.geeksbox.demo.restfulspringboot.model.Picture_Of_PostEnity;
import net.geeksbox.demo.restfulspringboot.model.PostEnity;
import net.geeksbox.demo.restfulspringboot.model.PostModel;
import net.geeksbox.demo.restfulspringboot.model.User;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostEnityRepository extends JpaRepository<PostEnity, Integer> {
	
}
