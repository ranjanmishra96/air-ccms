package com.test.server.domain;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name ="userDetail")
public class User {

	private Long id;
    private String fullName;
    private String username;
    private Character gender;
    private String email1;
    private String homeAddress;
    
    public User(){
    	
    }
	
    
    @Id
    @Column(name = "user_id", unique = true, nullable = false, precision = 15, scale = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    public Long getId() {
	return this.id;
    }

    public void setId(Long id) {
	this.id = id;
    }
    
    @Column(name = "user_full_name", nullable = false, length = 500)
    public String getFullName() {
	return this.fullName;
    }

    public void setFullName(String fullName) {
	this.fullName = fullName;
    }
    
    @Column(name = "user_username", nullable = false, length = 100)
    public String getUsername() {
	return this.username;
    }

    public void setUsername(String username) {
	this.username = username;
    }


   

    @Column(name = "user_gender", nullable = false, length = 1)
    public Character getGender() {
	return this.gender;
    }

    public void setGender(Character gender) {
	this.gender = gender;
    }

    @Column(name = "user_email_1", nullable = false, length = 100)
    public String getEmail1() {
	return this.email1;
    }

    public void setEmail1(String email1) {
	this.email1 = email1;
    }

  

  

    @Column(name = "user_home_address", length = 2000)
    public String getHomeAddress() {
	return this.homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
	this.homeAddress = homeAddress;
    }
}
