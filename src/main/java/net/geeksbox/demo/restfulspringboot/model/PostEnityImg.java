package net.geeksbox.demo.restfulspringboot.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Getter @Setter
public class PostEnityImg {

    
    	
    private PostEnity post;
    private Picture_Of_PostEnity ListImg;
   
    
  

	


	public PostEnity getPost() {
		return post;
	}







	public void setPost(PostEnity post) {
		this.post = post;
	}







	public Picture_Of_PostEnity getListImg() {
		return ListImg;
	}







	public void setListImg(Picture_Of_PostEnity listImg) {
		ListImg = listImg;
	}







	public PostEnityImg() {
		super();
	}
    
    
	
}
