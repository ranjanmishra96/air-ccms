package com.test.server.wsentity;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class WSUser {
	
	private Long id;
	private String username;
	private String password;
	private Boolean active;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@NotNull(message = "{error.empty}")
	@Length(min = 3, max = 500, message = "{user.error.fullname.length}")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@NotNull(message = "{error.empty}")
	@Length(min = 3, max = 500, message = "{user.error.password.length}")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	

}
