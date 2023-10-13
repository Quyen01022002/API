package net.geeksbox.demo.restfulspringboot.repository;

import net.geeksbox.demo.restfulspringboot.model.Interaction;
import net.geeksbox.demo.restfulspringboot.model.Picture_Of_PostEnity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InteractionsRepository extends JpaRepository<Interaction, Integer> {
@Query(value="Select * from INTERACTIONS where user_id=?1 and post_id=?2",nativeQuery = true)
public  Interaction checkliked(int userid,int postid);
}
