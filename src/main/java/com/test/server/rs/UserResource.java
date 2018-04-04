package com.test.server.rs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.server.domain.User;
import com.test.server.service.UserService;

@Component("userResource")
public class UserResource {
	
	@Autowired
	public UserService userService;
	
	public List<User> getUserDetails() throws Exception
	{
		List<User> user = userService.getUserDetails();
		
		return user;
	}
	

}
