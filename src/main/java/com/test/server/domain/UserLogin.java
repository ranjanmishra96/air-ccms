package com.test.server.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="m4_user")
public class UserLogin {
	
	private Long id;
	private String username;
	private String password;
	private Boolean active;
	
	@Id
    @Column(name = "user_id", unique = true, nullable = false, precision = 15, scale = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "m4_user_seq")
	@SequenceGenerator(name = "m4_user_seq", sequenceName = "m4_user_seq", allocationSize = 1)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "user_full_name", nullable = false, length = 500)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name = "user_password",length = 500)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "active", nullable = false)
	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
}
