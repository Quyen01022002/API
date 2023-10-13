package net.geeksbox.demo.restfulspringboot.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "[Posts]")
@Getter @Setter
public class PostEnity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int post_id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "content_post")
    private String content_post;
    
    @Column(name = "timestamp")
    private Date timestamp;
    @Column(name = "status")
    private String status;


	public int getPost_id() {
		return post_id;
	}


	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getContent_post() {
		return content_post;
	}


	public void setContent_post(String content_post) {
		this.content_post = content_post;
	}


	public Date getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public PostEnity() {
		super();
	}
    
    
	
}
