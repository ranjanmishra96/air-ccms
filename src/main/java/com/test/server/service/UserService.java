package com.test.server.service;

import java.util.List;

import com.test.server.domain.User;
import com.test.server.exception.CCMSException;


public interface UserService extends CRUDService<User> {
	
	public List<User> getUserDetails() throws Exception;

	public Long createUser(User user);

	public User getUserById(Long id);

	public void UpdateUser(User user);

	public void deleteUser(User user);

	
	
	
}
