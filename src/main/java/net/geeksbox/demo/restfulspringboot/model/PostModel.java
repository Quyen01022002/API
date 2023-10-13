package net.geeksbox.demo.restfulspringboot.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class PostModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int post_id;

    @Column(name = "first_name")
    private String first_name;
    
    @Column(name = "last_name")
    private String last_name;
    
    @Column(name = "profile_picture")
    private String profile_picture;
    
    @Column(name = "content_post")
    private String content_post;
    
    
    @Column(name = "timestamp")
    private Date timestamp;
    
    @Column(name = "status")
    private String status;
    @Column(name = "post_source")
    private String post_source;
    @Column(name = "comment_count")
    private int comment_count;
    @Column(name = "like_count")
    private int like_count;
    @Column(name = "user_liked")
    private Boolean user_liked;	
    
   

	public Boolean getUser_liked() {
		return user_liked;
	}




	public void setUser_liked(Boolean user_liked) {
		this.user_liked = user_liked;
	}




	public String getPost_source() {
		return post_source;
	}




	public void setPost_source(String post_source) {
		this.post_source = post_source;
	}




	public int getComment_count() {
		return comment_count;
	}




	public void setComment_count(int comment_count) {
		this.comment_count = comment_count;
	}




	public int getLike_count() {
		return like_count;
	}




	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}




	public int getPost_id() {
		return post_id;
	}




	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}




	public String getFirst_name() {
		return first_name;
	}




	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}




	public String getLast_name() {
		return last_name;
	}




	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}




	public String getProfile_picture() {
		return profile_picture;
	}




	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
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




	public PostModel() {
		super();
	}
    
    
	
}
