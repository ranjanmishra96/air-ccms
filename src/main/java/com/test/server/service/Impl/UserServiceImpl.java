package com.test.server.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.test.server.dao.GenericDAO;
import com.test.server.dao.UserDAO;
import com.test.server.domain.User;
import com.test.server.exception.CCMSException;
import com.test.server.service.UserService;

@Service("userService")
public class UserServiceImpl extends CRUDServiceImpl<User> implements UserService{

	
	@Override
	public GenericDAO<User, Long> getBaseDAO() {
		// TODO Auto-generated method stub
		return userDAO;
	}
	
	@Autowired
	private UserDAO userDAO;
	


	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public List<User> getUserDetails() throws Exception {
		// TODO Auto-generated method stub
		return userDAO.getUserDetails();
	}


	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public Long createUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.create(user);
	}


	@Override
	@Transactional(propagation=Propagation.REQUIRED , readOnly= true)
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userDAO.getUserById(id);
	}


	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void UpdateUser(User user) {
		// TODO Auto-generated method stub
		userDAO.update(user);
		
	}


	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		//userDAO.delete();
//		Query query = delete(id);
		userDAO.delete(user);		
	}



	


	



	
	

}
