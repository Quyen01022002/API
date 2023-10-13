package net.geeksbox.demo.restfulspringboot.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "[INTERACTIONS]")
@Getter @Setter
public class Interaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int interaction_id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "post_id")
    private int post_id;
    
    @Column(name = "is_liked")
    private Boolean is_liked;
    @Column(name = "timestamp")
    private Date timestamp;

	public int getInteraction_id() {
		return interaction_id;
	}




	public void setInteraction_id(int interaction_id) {
		this.interaction_id = interaction_id;
	}




	public int getUser_id() {
		return user_id;
	}




	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}




	public int getPost_id() {
		return post_id;
	}




	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}




	public Boolean getIs_liked() {
		return is_liked;
	}




	public void setIs_liked(Boolean is_liked) {
		this.is_liked = is_liked;
	}




	public Date getTimestamp() {
		return timestamp;
	}




	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}




	public Interaction() {
		super();
	}
    
    
	
}
