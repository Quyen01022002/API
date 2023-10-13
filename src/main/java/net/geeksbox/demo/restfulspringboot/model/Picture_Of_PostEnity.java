package net.geeksbox.demo.restfulspringboot.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "[PICTURE_OF_POST]")
@Getter @Setter
public class Picture_Of_PostEnity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pic_id;

    @Column(name = "post_id")
    private int post_id;

    @Column(name = "link_picture")
    private String link_picture;
    
    
   

	public int getPic_id() {
		return pic_id;
	}




	public void setPic_id(int pic_id) {
		this.pic_id = pic_id;
	}




	public int getPost_id() {
		return post_id;
	}




	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}




	public String getLink_picture() {
		return link_picture;
	}




	public void setLink_picture(String link_picture) {
		this.link_picture = link_picture;
	}




	public Picture_Of_PostEnity() {
		super();
	}
    
    
	
}
