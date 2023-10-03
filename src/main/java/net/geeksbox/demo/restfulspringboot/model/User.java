package net.geeksbox.demo.restfulspringboot.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "[Users]")
@Getter @Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_ID;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;
    
    @Column(name = "email")
    private String email;
    @Column(name = "is_email")
    private Boolean is_email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "is_phone")
    private Boolean is_phone;

    @Column(name = "password_hash")
    private String password_hash;
    
    @Column(name = "hash")
    private String hash;
    
    @Column(name = "profile_picture")
    private String profile_picture;
    
    @Column(name = "is_actived")
    private Boolean is_actived;

    @Column(name = "created_at")
    private Date create_at;
    
    @Column(name = "updated_at")
    private Date update_at;

	public int getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIs_email() {
		return is_email;
	}

	public void setIs_email(Boolean is_email) {
		this.is_email = is_email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean getIs_phone() {
		return is_phone;
	}

	public void setIs_phone(Boolean is_phone) {
		this.is_phone = is_phone;
	}

	public String getPassword_hash() {
		return password_hash;
	}

	public void setPassword_hash(String password_hash) {
		this.password_hash = password_hash;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getProfile_picture() {
		return profile_picture;
	}

	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
	}

	public Boolean getIs_actived() {
		return is_actived;
	}

	public void setIs_actived(Boolean is_actived) {
		this.is_actived = is_actived;
	}

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

	public Date getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}

	public User() {
		super();
	}
    
    
	
}
