package net.geeksbox.demo.restfulspringboot.repository;

import net.geeksbox.demo.restfulspringboot.model.Picture_Of_PostEnity;
import net.geeksbox.demo.restfulspringboot.model.PostModel;
import net.geeksbox.demo.restfulspringboot.model.User;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureOfPostRepository extends JpaRepository<Picture_Of_PostEnity, Integer> {
	@Query(value="select * from PICTURE_OF_POST where post_id=?",nativeQuery = true)
	public  List<Picture_Of_PostEnity> PostImg(int postid);
}
