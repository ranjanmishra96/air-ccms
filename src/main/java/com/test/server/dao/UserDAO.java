package com.test.server.dao;

import java.util.List;

import com.test.server.domain.User;
import com.test.server.exception.CCMSException;

public interface UserDAO extends GenericDAO<User, Long> {
	
	public List<User> getUserDetails() throws Exception;
	
	public User getUserById(Long id);

	
	


}
