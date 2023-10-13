package net.geeksbox.demo.restfulspringboot.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Getter @Setter
public class PostModelImg {

    
    	
    private PostModel post;
    private List<Picture_Of_PostEnity> ListImg;
   
    
  

	


	public PostModel getPost() {
		return post;
	}







	public void setPost(PostModel post) {
		this.post = post;
	}







	public List<Picture_Of_PostEnity> getListImg() {
		return ListImg;
	}







	public void setListImg(List<Picture_Of_PostEnity> listImg) {
		ListImg = listImg;
	}







	public PostModelImg() {
		super();
	}
    
    
	
}
